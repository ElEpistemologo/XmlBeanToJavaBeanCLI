//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.5 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package ovh.xmlbeantojavabean.api.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour collectionType complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="collectionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="value-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectionType")
@XmlSeeAlso({
    PropsType.class,
    MapType.class,
    ListOrSetType.class
})
public class CollectionType {

    /**
     * The default Java type for nested values. Must be a fully qualified
     * 	class name.
     * 
     */
    @XmlAttribute(name = "value-type")
    protected String valueType;

    /**
     * The default Java type for nested values. Must be a fully qualified
     * 	class name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Définit la valeur de la propriété valueType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValueType()
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

}
