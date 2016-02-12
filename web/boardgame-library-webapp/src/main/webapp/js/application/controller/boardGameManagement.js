/**
 * Board Game Management Controller is responsible to manipulate the Board Games of the application.
 */
app.controller('BoardGameManagement', ['$scope', '$rootScope',
	function ($scope, $rootScope) {


		/**
		 * Creates the scope functions of the Controller.
		 */
		function createScopeFunctions() {
		}

		/**
		 * Initializes the scope functions of the Controller.
		 */
		function initScopeVariables() {

		}

		/**
		 * Initializes actions on UI components.
		 */
		function setActions() {

		}

		/**
		 * Initializes the Controller.
		 */
		function initializeController() {
			createScopeFunctions();
			setActions();
			initScopeVariables();
			//Validator.init();

			$scope.rowCollection = [
				{firstName: 'Board Game 1', lastName: 'Hasbro', birthDate: new Date('1987-05-21'), balance: 102, email: 'whatever@gmail.com'},
				{firstName: 'Board Game 2', lastName: 'Hasbro', birthDate: new Date('1987-04-25'), balance: -2323.22, email: 'oufblandou@gmail.com'},
				{firstName: 'Board Game 3', lastName: 'Hasbro', birthDate: new Date('1955-08-27'), balance: 42343, email: 'raymondef@gmail.com'}
			];
		}

		initializeController();
	}]);
