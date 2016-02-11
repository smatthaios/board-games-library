/**
 * Profile Controller is responsible to manipulate Users profile.
 */
app.controller('Profile', ['$scope', '$rootScope', '$location', 'UserService', 'ProjectService',
	function ($scope, $rootScope, $location, UserService) {
		var infoPanel = $('#information'),
			newPassword = $('#newPassword'),
			newPasswordConfirm = $('#newPasswordConfirm'),
			changePasswordPanel = $('#change-password');

		/**
		 * Creates the scope functions of the Controller.
		 */
		function createScopeFunctions() {
			/**
			 * Resets the active User profile info in the view (not the back end).
			 */
			$scope.resetProfileInfo = function () {
				Validator.reset(infoPanel);
			}

			/**
			 * Saves the active User Profile.
			 */
			$scope.saveProfile = function () {
				infoPanel.mask(true);
				UserService.updateProfile($scope.newFirstName, $scope.newLastName, $scope.defaultProjectId, $scope.introEnabled).then(function (data) {
					$rootScope.activeUser = data[0];
					infoPanel.mask(false);
					Notify.info(Locale.get('userUpdated'));
				});
			}

			/**
			 * Changes the active User password.
			 */
			$scope.changePassword = function () {
				if (!Validator.isValid(changePasswordPanel)) {
					return;
				}
				if ($scope.newPassword != $scope.newPasswordConfirm) {
					Validator.showErrorMessage(newPassword, 'Passwords are not the same.');
					Validator.showErrorMessage(newPasswordConfirm, 'Passwords are not the same.');
					return;
				}
				if (!passwordRegExp.test($scope.newPassword)) {
					Validator.showErrorMessage(newPassword, 'Password requires one lower case letter, one upper case letter, one digit, 6-13 length, and no spaces');
					return;
				}

				changePasswordPanel.mask(true);
				UserService.changePassword($scope.oldPassword, $scope.newPassword).then(function () {
					changePasswordPanel.mask(false);
					Notify.info('User successfully updated.');
				});
			}
		}

		/**
		 * Initializes the scope functions of the Controller.
		 */
		function initScopeVariables() {
			if ($rootScope.activeUser) {
				$scope.newFirstName = $rootScope.activeUser.firstName;
				$scope.newLastName = $rootScope.activeUser.lastName;
				$scope.defaultProjectId = $rootScope.activeUser.defaultProjectId;
				$scope.introEnabled = $rootScope.activeUser.introEnabled;
			}
		}

		/**
		 * Initializes actions on UI components.
		 */
		function setActions() {
			var rootWatch = $rootScope.$watch('activeUser', function (activeUser) {
				if (activeUser) {
					initScopeVariables();
				}
			});
			$scope.$on('$destroy', function () {
				rootWatch();
			});
		}

		/**
		 * Initializes the Controller.
		 */
		function initializeController() {
			createScopeFunctions();
			setActions();
			initScopeVariables();
			Validator.init();
		}

		initializeController();
	}]);
