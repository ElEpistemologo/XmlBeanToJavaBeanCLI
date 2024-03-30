//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.5 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package ovh.xmlbeantojavabean.api.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://www.springframework.org/schema/beans}listOrSetType">
 *       <attribute name="merge" type="{http://www.springframework.org/schema/beans}defaultable-boolean" default="default" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "set")
public class Set
    extends ListOrSetType
{

    /**
     * Enables/disables merging for collections when using parent/child beans.
     * 
     */
    @XmlAttribute(name = "merge")
    protected DefaultableBoolean merge;

    /**
     * Enables/disables merging for collections when using parent/child beans.
     * 
     * @return
     *     possible object is
     *     {@link DefaultableBoolean }
     *     
     */
    public DefaultableBoolean getMerge() {
        if (merge == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return merge;
        }
    }

    /**
     * Définit la valeur de la propriété merge.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultableBoolean }
     *     
     * @see #getMerge()
     */
    public void setMerge(DefaultableBoolean value) {
        this.merge = value;
    }

}
