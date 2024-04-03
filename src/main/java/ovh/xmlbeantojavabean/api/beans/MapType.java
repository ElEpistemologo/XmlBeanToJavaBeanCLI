//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.5 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package ovh.xmlbeantojavabean.api.beans;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour mapType complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="mapType">
 *   <complexContent>
 *     <extension base="{http://www.springframework.org/schema/beans}collectionType">
 *       <sequence>
 *         <element ref="{http://www.springframework.org/schema/beans}description" minOccurs="0"/>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{http://www.springframework.org/schema/beans}entry"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="key-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapType", propOrder = {
    "description",
    "entry"
})
@XmlSeeAlso({
    Map.class
})
public class MapType
    extends CollectionType
{

    /**
     * Contains informative text describing the purpose of the enclosing element.
     * 	Used primarily for user documentation of XML bean definition documents.
     * 
     */
    protected Description description;
    protected List<EntryType> entry;
    /**
     * The default Java type for nested entry keys. Must be a fully qualified
     * 	class name.
     * 
     */
    @XmlAttribute(name = "key-type")
    protected String keyType;

    /**
     * Contains informative text describing the purpose of the enclosing element.
     * 	Used primarily for user documentation of XML bean definition documents.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     * @see #getDescription()
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the entry property.
     */
    public List<EntryType> getEntry() {
        if (entry == null) {
            entry = new ArrayList<>();
        }
        return this.entry;
    }

    /**
     * The default Java type for nested entry keys. Must be a fully qualified
     * 	class name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Définit la valeur de la propriété keyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyType()
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

}
