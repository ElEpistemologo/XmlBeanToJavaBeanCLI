//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.5 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package ovh.xmlbeantojavabean.api.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element ref="{http://www.springframework.org/schema/beans}description" minOccurs="0"/>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{http://www.springframework.org/schema/beans}import"/>
 *           <element ref="{http://www.springframework.org/schema/beans}alias"/>
 *           <element ref="{http://www.springframework.org/schema/beans}bean"/>
 *           <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         </choice>
 *         <element ref="{http://www.springframework.org/schema/beans}beans" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="default-lazy-init" type="{http://www.springframework.org/schema/beans}defaultable-boolean" default="default" />
 *       <attribute name="default-merge" type="{http://www.springframework.org/schema/beans}defaultable-boolean" default="default" />
 *       <attribute name="default-autowire" default="default">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="default"/>
 *             <enumeration value="no"/>
 *             <enumeration value="byName"/>
 *             <enumeration value="byType"/>
 *             <enumeration value="constructor"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="default-autowire-candidates" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="default-init-method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="default-destroy-method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "importOrAliasOrBean",
    "beans"
})
@XmlRootElement(name = "beans")
public class Beans {

    /**
     * Contains informative text describing the purpose of the enclosing element.
     * 	Used primarily for user documentation of XML bean definition documents.
     * 
     */
    protected Description description;
    @XmlElementRefs({
        @XmlElementRef(name = "import", namespace = "http://www.springframework.org/schema/beans", type = Import.class, required = false),
        @XmlElementRef(name = "alias", namespace = "http://www.springframework.org/schema/beans", type = Alias.class, required = false),
        @XmlElementRef(name = "bean", namespace = "http://www.springframework.org/schema/beans", type = Bean.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> importOrAliasOrBean;
    /**
     * Container for <bean> and other elements, typically the root element in the document.
     * 	Allows the definition of default values for all nested bean definitions. May itself
     * 	be nested for the purpose of defining a subset of beans with certain default values or
     * 	to be registered only when certain profile(s) are active. Any such nested <beans> element
     * 	must be declared as the last element in the document.
     * 
     */
    protected List<Beans> beans;
    /**
     * The set of profiles for which this <beans> element should be parsed. Multiple profiles
     * 	can be separated by spaces, commas, or semi-colons.
     * 
     * 	If one or more of the specified profiles are active at time of parsing, the <beans>
     * 	element will be parsed, and all of its <bean> elements registered, &lt;import&gt;
     * 	elements followed, etc.  If none of the specified profiles are active at time of
     * 	parsing, then the entire element and its contents will be ignored.
     * 
     * 	If a profile is prefixed with the NOT operator '!', e.g.
     * 
     * 		<beans profile="p1,!p2">
     * 
     * 	indicates that the <beans> element should be parsed if profile "p1" is active or
     * 	if profile "p2" is not active.
     * 
     * 	Profiles are activated in one of two ways:
     * 		Programmatic:
     * 			ConfigurableEnvironment#setActiveProfiles(String...)
     * 			ConfigurableEnvironment#setDefaultProfiles(String...)
     * 
     * 		Properties (typically through -D system properties, environment variables, or
     * 		servlet context init params):
     * 			spring.profiles.active=p1,p2
     * 			spring.profiles.default=p1,p2
     * 
     */
    @XmlAttribute(name = "profile")
    protected String profile;
    /**
     * The default 'lazy-init' value; see the documentation for the
     * 	'lazy-init' attribute of the 'bean' element. The default is "default",
     * 	indicating inheritance from outer 'beans' sections in case of nesting,
     * 	otherwise falling back to "false".
     * 
     */
    @XmlAttribute(name = "default-lazy-init")
    protected DefaultableBoolean defaultLazyInit;
    /**
     * The default 'merge' value; see the documentation for the 'merge'
     * 	attribute of the various collection elements. The default is "default",
     * 	indicating inheritance from outer 'beans' sections in case of nesting,
     * 	otherwise falling back to "false".
     * 
     */
    @XmlAttribute(name = "default-merge")
    protected DefaultableBoolean defaultMerge;
    /**
     * The default 'autowire' value; see the documentation for the
     * 	'autowire' attribute of the 'bean' element. The default is "default",
     * 	indicating inheritance from outer 'beans' sections in case of nesting,
     * 	otherwise falling back to "no" (i.e. no externally driven autowiring).
     * 
     */
    @XmlAttribute(name = "default-autowire")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultAutowire;
    /**
     * A default bean name pattern for identifying autowire candidates:
     * 	e.g. "*Service", "data*", "*Service*", "data*Service".
     * 	Also accepts a comma-separated list of patterns: e.g. "*Service,*Dao".
     * 	See the documentation for the 'autowire-candidate' attribute of the
     * 	'bean' element for the semantic details of autowire candidate beans.
     * 
     */
    @XmlAttribute(name = "default-autowire-candidates")
    protected String defaultAutowireCandidates;
    /**
     * The default 'init-method' value; see the documentation for the
     * 	'init-method' attribute of the 'bean' element.
     * 
     */
    @XmlAttribute(name = "default-init-method")
    protected String defaultInitMethod;
    /**
     * The default 'destroy-method' value; see the documentation for the
     * 	'destroy-method' attribute of the 'bean' element.
     * 
     */
    @XmlAttribute(name = "default-destroy-method")
    protected String defaultDestroyMethod;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * Gets the value of the importOrAliasOrBean property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importOrAliasOrBean property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportOrAliasOrBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Alias }
     * {@link Bean }
     * {@link Import }
     * </p>
     * 
     * 
     * @return
     *     The value of the importOrAliasOrBean property.
     */
    public List<Object> getImportOrAliasOrBean() {
        if (importOrAliasOrBean == null) {
            importOrAliasOrBean = new ArrayList<>();
        }
        return this.importOrAliasOrBean;
    }

    /**
     * Container for <bean> and other elements, typically the root element in the document.
     * 	Allows the definition of default values for all nested bean definitions. May itself
     * 	be nested for the purpose of defining a subset of beans with certain default values or
     * 	to be registered only when certain profile(s) are active. Any such nested <beans> element
     * 	must be declared as the last element in the document.
     * 
     * Gets the value of the beans property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beans property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Beans }
     * </p>
     * 
     * 
     * @return
     *     The value of the beans property.
     */
    public List<Beans> getBeans() {
        if (beans == null) {
            beans = new ArrayList<>();
        }
        return this.beans;
    }

    /**
     * The set of profiles for which this <beans> element should be parsed. Multiple profiles
     * 	can be separated by spaces, commas, or semi-colons.
     * 
     * 	If one or more of the specified profiles are active at time of parsing, the <beans>
     * 	element will be parsed, and all of its <bean> elements registered, &lt;import&gt;
     * 	elements followed, etc.  If none of the specified profiles are active at time of
     * 	parsing, then the entire element and its contents will be ignored.
     * 
     * 	If a profile is prefixed with the NOT operator '!', e.g.
     * 
     * 		<beans profile="p1,!p2">
     * 
     * 	indicates that the <beans> element should be parsed if profile "p1" is active or
     * 	if profile "p2" is not active.
     * 
     * 	Profiles are activated in one of two ways:
     * 		Programmatic:
     * 			ConfigurableEnvironment#setActiveProfiles(String...)
     * 			ConfigurableEnvironment#setDefaultProfiles(String...)
     * 
     * 		Properties (typically through -D system properties, environment variables, or
     * 		servlet context init params):
     * 			spring.profiles.active=p1,p2
     * 			spring.profiles.default=p1,p2
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Définit la valeur de la propriété profile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfile()
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * The default 'lazy-init' value; see the documentation for the
     * 	'lazy-init' attribute of the 'bean' element. The default is "default",
     * 	indicating inheritance from outer 'beans' sections in case of nesting,
     * 	otherwise falling back to "false".
     * 
     * @return
     *     possible object is
     *     {@link DefaultableBoolean }
     *     
     */
    public DefaultableBoolean getDefaultLazyInit() {
        if (defaultLazyInit == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return defaultLazyInit;
        }
    }

    /**
     * Définit la valeur de la propriété defaultLazyInit.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultableBoolean }
     *     
     * @see #getDefaultLazyInit()
     */
    public void setDefaultLazyInit(DefaultableBoolean value) {
        this.defaultLazyInit = value;
    }

    /**
     * The default 'merge' value; see the documentation for the 'merge'
     * 	attribute of the various collection elements. The default is "default",
     * 	indicating inheritance from outer 'beans' sections in case of nesting,
     * 	otherwise falling back to "false".
     * 
     * @return
     *     possible object is
     *     {@link DefaultableBoolean }
     *     
     */
    public DefaultableBoolean getDefaultMerge() {
        if (defaultMerge == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return defaultMerge;
        }
    }

    /**
     * Définit la valeur de la propriété defaultMerge.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultableBoolean }
     *     
     * @see #getDefaultMerge()
     */
    public void setDefaultMerge(DefaultableBoolean value) {
        this.defaultMerge = value;
    }

    /**
     * The default 'autowire' value; see the documentation for the
     * 	'autowire' attribute of the 'bean' element. The default is "default",
     * 	indicating inheritance from outer 'beans' sections in case of nesting,
     * 	otherwise falling back to "no" (i.e. no externally driven autowiring).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAutowire() {
        if (defaultAutowire == null) {
            return "default";
        } else {
            return defaultAutowire;
        }
    }

    /**
     * Définit la valeur de la propriété defaultAutowire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultAutowire()
     */
    public void setDefaultAutowire(String value) {
        this.defaultAutowire = value;
    }

    /**
     * A default bean name pattern for identifying autowire candidates:
     * 	e.g. "*Service", "data*", "*Service*", "data*Service".
     * 	Also accepts a comma-separated list of patterns: e.g. "*Service,*Dao".
     * 	See the documentation for the 'autowire-candidate' attribute of the
     * 	'bean' element for the semantic details of autowire candidate beans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAutowireCandidates() {
        return defaultAutowireCandidates;
    }

    /**
     * Définit la valeur de la propriété defaultAutowireCandidates.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultAutowireCandidates()
     */
    public void setDefaultAutowireCandidates(String value) {
        this.defaultAutowireCandidates = value;
    }

    /**
     * The default 'init-method' value; see the documentation for the
     * 	'init-method' attribute of the 'bean' element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultInitMethod() {
        return defaultInitMethod;
    }

    /**
     * Définit la valeur de la propriété defaultInitMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultInitMethod()
     */
    public void setDefaultInitMethod(String value) {
        this.defaultInitMethod = value;
    }

    /**
     * The default 'destroy-method' value; see the documentation for the
     * 	'destroy-method' attribute of the 'bean' element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultDestroyMethod() {
        return defaultDestroyMethod;
    }

    /**
     * Définit la valeur de la propriété defaultDestroyMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDefaultDestroyMethod()
     */
    public void setDefaultDestroyMethod(String value) {
        this.defaultDestroyMethod = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
