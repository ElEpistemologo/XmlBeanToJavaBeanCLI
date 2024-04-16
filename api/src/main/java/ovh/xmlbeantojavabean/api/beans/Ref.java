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
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="bean" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ref")
public class Ref {

    /**
     * The name of the referenced bean.
     * 
     */
    @XmlAttribute(name = "bean")
    protected String bean;
    /**
     * The name of the referenced bean in a parent factory.
     * 
     */
    @XmlAttribute(name = "parent")
    protected String parent;

    /**
     * The name of the referenced bean.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBean() {
        return bean;
    }

    /**
     * Définit la valeur de la propriété bean.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBean()
     */
    public void setBean(String value) {
        this.bean = value;
    }

    /**
     * The name of the referenced bean in a parent factory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * Définit la valeur de la propriété parent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getParent()
     */
    public void setParent(String value) {
        this.parent = value;
    }

}
