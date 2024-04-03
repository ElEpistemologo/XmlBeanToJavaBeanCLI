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
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <sequence>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{http://www.springframework.org/schema/beans}arg-type"/>
 *         </choice>
 *       </sequence>
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="replacer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "argType"
})
@XmlRootElement(name = "replaced-method")
public class ReplacedMethod {

    @XmlElement(name = "arg-type")
    protected List<ArgType> argType;
    /**
     * The name of the method whose implementation must be replaced by the
     * 	IoC container. If this method is not overloaded, there is no need
     * 	to use arg-type subelements. If this method is overloaded, arg-type
     * 	subelements must be used for all override definitions for the method.
     * 
     */
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * Bean name of an implementation of the MethodReplacer interface in the
     * 	current or ancestor factories. This may be a singleton or prototype
     * 	bean. If it is a prototype, a new instance will be used for each
     * 	method replacement. Singleton usage is the norm.
     * 
     */
    @XmlAttribute(name = "replacer")
    protected String replacer;

    /**
     * Gets the value of the argType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getArgType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArgType }
     * </p>
     * 
     * 
     * @return
     *     The value of the argType property.
     */
    public List<ArgType> getArgType() {
        if (argType == null) {
            argType = new ArrayList<>();
        }
        return this.argType;
    }

    /**
     * The name of the method whose implementation must be replaced by the
     * 	IoC container. If this method is not overloaded, there is no need
     * 	to use arg-type subelements. If this method is overloaded, arg-type
     * 	subelements must be used for all override definitions for the method.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Bean name of an implementation of the MethodReplacer interface in the
     * 	current or ancestor factories. This may be a singleton or prototype
     * 	bean. If it is a prototype, a new instance will be used for each
     * 	method replacement. Singleton usage is the norm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacer() {
        return replacer;
    }

    /**
     * Définit la valeur de la propriété replacer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReplacer()
     */
    public void setReplacer(String value) {
        this.replacer = value;
    }

}
