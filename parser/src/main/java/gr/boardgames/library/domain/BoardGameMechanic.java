package gr.boardgames.library.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "boardgamemechanic")
public class BoardGameMechanic {

    long objectId;
    String value;

    public long getObjectId() {
        return objectId;
    }

    @XmlAttribute(name = "objectid")
    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public String getValue() {
        return value;
    }

    @XmlValue
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BoardGameMechanic{" +
                "objectId=" + objectId +
                ", value='" + value + '\'' +
                '}';
    }
}
