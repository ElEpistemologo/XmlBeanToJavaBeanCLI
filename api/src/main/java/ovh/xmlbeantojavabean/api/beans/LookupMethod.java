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
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="bean" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "lookup-method")
public class LookupMethod {

    /**
     * The name of the lookup method. This method may have arguments which
     * 	will be passed on to the target constructor or factory method. Note
     * 	that for backwards compatibility reasons, in a scenario with overloaded
     * 	non-abstract methods of the given name, only the no-arg variant of a
     * 	method will be turned into a container-driven lookup method.
     * 	Consider using the @Lookup annotation for more specific demarcation.
     * 
     */
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * The name of the bean in the current or ancestor factories that
     * 	the lookup method should resolve to. Usually this bean will be a
     * 	prototype, in which case the lookup method will return a distinct
     * 	instance on every invocation. If not specified, the lookup method's
     * 	return type will be used for a type-based lookup.
     * 
     */
    @XmlAttribute(name = "bean")
    protected String bean;

    /**
     * The name of the lookup method. This method may have arguments which
     * 	will be passed on to the target constructor or factory method. Note
     * 	that for backwards compatibility reasons, in a scenario with overloaded
     * 	non-abstract methods of the given name, only the no-arg variant of a
     * 	method will be turned into a container-driven lookup method.
     * 	Consider using the @Lookup annotation for more specific demarcation.
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
     * The name of the bean in the current or ancestor factories that
     * 	the lookup method should resolve to. Usually this bean will be a
     * 	prototype, in which case the lookup method will return a distinct
     * 	instance on every invocation. If not specified, the lookup method's
     * 	return type will be used for a type-based lookup.
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

}
