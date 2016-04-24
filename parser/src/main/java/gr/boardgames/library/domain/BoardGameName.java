package gr.boardgames.library.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "name")
public class BoardGameName {

    String primary;
    String value;

    public String getPrimary() {
        return primary;
    }

    @XmlAttribute
    public void setPrimary(String primary) {
        this.primary = primary;
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
        return "BoardGameName{" +
                "primary=" + primary +
                ", value=" + value +
                '}';
    }
}
