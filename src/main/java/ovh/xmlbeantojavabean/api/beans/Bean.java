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
import jakarta.xml.bind.JAXBElement;
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
 *     <extension base="{http://www.springframework.org/schema/beans}identifiedType">
 *       <group ref="{http://www.springframework.org/schema/beans}beanElements"/>
 *       <attGroup ref="{http://www.springframework.org/schema/beans}beanAttributes"/>
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "metaOrConstructorArgOrProperty"
})
@XmlRootElement(name = "bean")
public class Bean
    extends IdentifiedType
{

    /**
     * Contains informative text describing the purpose of the enclosing element.
     * 	Used primarily for user documentation of XML bean definition documents.
     * 
     */
    protected Description description;
    @XmlElementRefs({
        @XmlElementRef(name = "meta", namespace = "http://www.springframework.org/schema/beans", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "constructor-arg", namespace = "http://www.springframework.org/schema/beans", type = ConstructorArg.class, required = false),
        @XmlElementRef(name = "property", namespace = "http://www.springframework.org/schema/beans", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "qualifier", namespace = "http://www.springframework.org/schema/beans", type = Qualifier.class, required = false),
        @XmlElementRef(name = "lookup-method", namespace = "http://www.springframework.org/schema/beans", type = LookupMethod.class, required = false),
        @XmlElementRef(name = "replaced-method", namespace = "http://www.springframework.org/schema/beans", type = ReplacedMethod.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> metaOrConstructorArgOrProperty;
    /**
     * Can be used to create one or more aliases illegal in an (XML) id.
     * 	Multiple aliases can be separated by any number of spaces, commas,
     * 	or semi-colons (or indeed any mixture of the three).
     * 
     */
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * The fully qualified name of the bean's class, except if it serves only
     * 	as a parent definition for child bean definitions.
     * 
     */
    @XmlAttribute(name = "class")
    protected String clazz;
    /**
     * The name of the parent bean definition.
     * 
     * 	Will use the bean class of the parent if none is specified, but can
     * 	also override it. In the latter case, the child bean class must be
     * 	compatible with the parent, i.e. accept the parent's property values
     * 	and constructor argument values, if any.
     * 
     * 	A child bean definition will inherit constructor argument values,
     * 	property values and method overrides from the parent, with the option
     * 	to add new values. If init method, destroy method, factory bean and/or
     * 	factory method are specified, they will override the corresponding
     * 	parent settings.
     * 
     * 	The remaining settings will always be taken from the child definition:
     * 	depends on, autowire mode, scope, lazy init.
     * 
     */
    @XmlAttribute(name = "parent")
    protected String parent;
    /**
     * The scope of this bean: typically "singleton" (one shared instance,
     * 	which will be returned by all calls to getBean with the given id), or
     * 	"prototype" (independent instance resulting from each call to getBean).
     * 
     * 	By default, a bean will be a singleton, unless the bean has a parent
     * 	bean definition in which case it will inherit the parent's scope.
     * 
     * 	Singletons are most commonly used, and are ideal for multi-threaded
     * 	service objects. Further scopes, such as "request" or "session", might
     * 	be supported by extended bean factories (e.g. in a web environment).
     * 
     * 	Inner bean definitions inherit the scope of their containing bean
     * 	definition, unless explicitly specified: The inner bean will be a
     * 	singleton if the containing bean is a singleton, and a prototype if
     * 	the containing bean is a prototype, etc.
     * 
     */
    @XmlAttribute(name = "scope")
    protected String scope;
    /**
     * Is this bean "abstract", that is, not meant to be instantiated itself
     * 	but rather just serving as parent for concrete child bean definitions?
     * 	The default is "false". Specify "true" to tell the bean factory to not
     * 	try to instantiate that particular bean in any case.
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per abstract bean definition.
     * 
     */
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    /**
     * Indicates whether this bean is to be lazily initialized. If "false",
     * 	it will be instantiated on startup by bean factories that perform eager
     * 	initialization of singletons. The effective default is "false".
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per concrete bean definition. It can be
     * 	shared through the 'default-lazy-init' attribute at the 'beans' level
     * 	and potentially inherited from outer 'beans' defaults in case of nested
     * 	'beans' sections (e.g. with different profiles).
     * 
     */
    @XmlAttribute(name = "lazy-init")
    protected DefaultableBoolean lazyInit;
    /**
     * Controls whether bean properties are "autowired".
     * 	This is an automagical process in which bean references don't need
     * 	to be coded explicitly in the XML bean definition file, but rather the
     * 	Spring container works out dependencies. The effective default is "no".
     * 
     * 	There are 4 modes:
     * 
     * 	1. "no"
     * 	The traditional Spring default. No automagical wiring. Bean references
     * 	must be defined in the XML file via the <ref/> element (or "ref"
     * 	attribute). We recommend this in most cases as it makes documentation
     * 	more explicit.
     * 
     * 	Note that this default mode also allows for annotation-driven autowiring,
     * 	if activated. "no" refers to externally driven autowiring only, not
     * 	affecting any autowiring demands that the bean class itself expresses.
     * 
     * 	2. "byName"
     * 	Autowiring by property name. If a bean of class Cat exposes a "dog"
     * 	property, Spring will try to set this to the value of the bean "dog"
     * 	in the current container. If there is no matching bean by name, nothing
     * 	special happens.
     * 
     * 	3. "byType"
     * 	Autowiring if there is exactly one bean of the property type in the
     * 	container. If there is more than one, a fatal error is raised, and
     * 	you cannot use byType autowiring for that bean. If there is none,
     * 	nothing special happens.
     * 
     * 	4. "constructor"
     * 	Analogous to "byType" for constructor arguments. If there is not exactly
     * 	one bean of the constructor argument type in the bean factory, a fatal
     * 	error is raised.
     * 
     * 	Note that explicit dependencies, i.e. "property" and "constructor-arg"
     * 	elements, always override autowiring.
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per concrete bean definition. It can be
     * 	shared through the 'default-autowire' attribute at the 'beans' level
     * 	and potentially inherited from outer 'beans' defaults in case of nested
     * 	'beans' sections (e.g. with different profiles).
     * 
     */
    @XmlAttribute(name = "autowire")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autowire;
    /**
     * The names of the beans that this bean depends on being initialized.
     * 	The bean factory will guarantee that these beans get initialized
     * 	before this bean.
     * 
     * 	Note that dependencies are normally expressed through bean properties
     * 	or constructor arguments. This property should just be necessary for
     * 	other kinds of dependencies like statics (*ugh*) or database preparation
     * 	on startup.
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per concrete bean definition.
     * 
     */
    @XmlAttribute(name = "depends-on")
    protected String dependsOn;
    /**
     * Indicates whether or not this bean should be considered when looking
     * 	for matching candidates to satisfy another bean's autowiring requirements.
     * 	Note that this does not affect explicit references by name, which will get
     * 	resolved even if the specified bean is not marked as an autowire candidate.
     * 
     */
    @XmlAttribute(name = "autowire-candidate")
    protected DefaultableBoolean autowireCandidate;
    /**
     * Specifies that this bean should be given preference when multiple
     * 	candidates are qualified to autowire a single-valued dependency.
     * 	If exactly one 'primary' bean exists among the candidates, it
     * 	will be the autowired value.
     * 
     */
    @XmlAttribute(name = "primary")
    protected Boolean primary;
    /**
     * The name of the custom initialization method to invoke after setting
     * 	bean properties. The method must have no arguments, but may throw any
     * 	exception.
     * 
     * 	This is an alternative to implementing Spring's InitializingBean
     * 	interface or marking a method with the PostConstruct annotation.
     * 
     */
    @XmlAttribute(name = "init-method")
    protected String initMethod;
    /**
     * The name of the custom destroy method to invoke on bean factory shutdown.
     * 	The method must have no arguments, but may throw any exception.
     * 
     * 	This is an alternative to implementing Spring's DisposableBean
     * 	interface or the standard Java Closeable/AutoCloseable interface,
     * 	or marking a method with the PreDestroy annotation.
     * 
     * 	Note: Only invoked on beans whose lifecycle is under the full
     * 	control of the factory - which is always the case for singletons,
     * 	but not guaranteed for any other scope.
     * 
     */
    @XmlAttribute(name = "destroy-method")
    protected String destroyMethod;
    /**
     * The name of a factory method to use to create this object. Use
     * 	constructor-arg elements to specify arguments to the factory method,
     * 	if it takes arguments. Autowiring does not apply to factory methods.
     * 
     * 	If the "class" attribute is present, the factory method will be a static
     * 	method on the class specified by the "class" attribute on this bean
     * 	definition. Often this will be the same class as that of the constructed
     * 	object - for example, when the factory method is used as an alternative
     * 	to a constructor. However, it may be on a different class. In that case,
     * 	the created object will *not* be of the class specified in the "class"
     * 	attribute. This is analogous to FactoryBean behavior.
     * 
     * 	If the "factory-bean" attribute is present, the "class" attribute is not
     * 	used, and the factory method will be an instance method on the object
     * 	returned from a getBean call with the specified bean name. The factory
     * 	bean may be defined as a singleton or a prototype.
     * 
     * 	The factory method can have any number of arguments. Autowiring is not
     * 	supported. Use indexed constructor-arg elements in conjunction with the
     * 	factory-method attribute.
     * 
     * 	Setter Injection can be used in conjunction with a factory method.
     * 	Method Injection cannot, as the factory method returns an instance,
     * 	which will be used when the container creates the bean.
     * 
     */
    @XmlAttribute(name = "factory-method")
    protected String factoryMethod;
    /**
     * Alternative to class attribute for factory-method usage.
     * 	If this is specified, no class attribute should be used.
     * 	This must be set to the name of a bean in the current or
     * 	ancestor factories that contains the relevant factory method.
     * 	This allows the factory itself to be configured using Dependency
     * 	Injection, and an instance (rather than static) method to be used.
     * 
     */
    @XmlAttribute(name = "factory-bean")
    protected String factoryBean;
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
     * Gets the value of the metaOrConstructorArgOrProperty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaOrConstructorArgOrProperty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMetaOrConstructorArgOrProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MetaType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropertyType }{@code >}
     * {@link Object }
     * {@link ConstructorArg }
     * {@link LookupMethod }
     * {@link Qualifier }
     * {@link ReplacedMethod }
     * </p>
     * 
     * 
     * @return
     *     The value of the metaOrConstructorArgOrProperty property.
     */
    public List<Object> getMetaOrConstructorArgOrProperty() {
        if (metaOrConstructorArgOrProperty == null) {
            metaOrConstructorArgOrProperty = new ArrayList<>();
        }
        return this.metaOrConstructorArgOrProperty;
    }

    /**
     * Can be used to create one or more aliases illegal in an (XML) id.
     * 	Multiple aliases can be separated by any number of spaces, commas,
     * 	or semi-colons (or indeed any mixture of the three).
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
     * The fully qualified name of the bean's class, except if it serves only
     * 	as a parent definition for child bean definitions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Définit la valeur de la propriété clazz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getClazz()
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * The name of the parent bean definition.
     * 
     * 	Will use the bean class of the parent if none is specified, but can
     * 	also override it. In the latter case, the child bean class must be
     * 	compatible with the parent, i.e. accept the parent's property values
     * 	and constructor argument values, if any.
     * 
     * 	A child bean definition will inherit constructor argument values,
     * 	property values and method overrides from the parent, with the option
     * 	to add new values. If init method, destroy method, factory bean and/or
     * 	factory method are specified, they will override the corresponding
     * 	parent settings.
     * 
     * 	The remaining settings will always be taken from the child definition:
     * 	depends on, autowire mode, scope, lazy init.
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

    /**
     * The scope of this bean: typically "singleton" (one shared instance,
     * 	which will be returned by all calls to getBean with the given id), or
     * 	"prototype" (independent instance resulting from each call to getBean).
     * 
     * 	By default, a bean will be a singleton, unless the bean has a parent
     * 	bean definition in which case it will inherit the parent's scope.
     * 
     * 	Singletons are most commonly used, and are ideal for multi-threaded
     * 	service objects. Further scopes, such as "request" or "session", might
     * 	be supported by extended bean factories (e.g. in a web environment).
     * 
     * 	Inner bean definitions inherit the scope of their containing bean
     * 	definition, unless explicitly specified: The inner bean will be a
     * 	singleton if the containing bean is a singleton, and a prototype if
     * 	the containing bean is a prototype, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Définit la valeur de la propriété scope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getScope()
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Is this bean "abstract", that is, not meant to be instantiated itself
     * 	but rather just serving as parent for concrete child bean definitions?
     * 	The default is "false". Specify "true" to tell the bean factory to not
     * 	try to instantiate that particular bean in any case.
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per abstract bean definition.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbstract() {
        return _abstract;
    }

    /**
     * Définit la valeur de la propriété abstract.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAbstract()
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Indicates whether this bean is to be lazily initialized. If "false",
     * 	it will be instantiated on startup by bean factories that perform eager
     * 	initialization of singletons. The effective default is "false".
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per concrete bean definition. It can be
     * 	shared through the 'default-lazy-init' attribute at the 'beans' level
     * 	and potentially inherited from outer 'beans' defaults in case of nested
     * 	'beans' sections (e.g. with different profiles).
     * 
     * @return
     *     possible object is
     *     {@link DefaultableBoolean }
     *     
     */
    public DefaultableBoolean getLazyInit() {
        if (lazyInit == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return lazyInit;
        }
    }

    /**
     * Définit la valeur de la propriété lazyInit.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultableBoolean }
     *     
     * @see #getLazyInit()
     */
    public void setLazyInit(DefaultableBoolean value) {
        this.lazyInit = value;
    }

    /**
     * Controls whether bean properties are "autowired".
     * 	This is an automagical process in which bean references don't need
     * 	to be coded explicitly in the XML bean definition file, but rather the
     * 	Spring container works out dependencies. The effective default is "no".
     * 
     * 	There are 4 modes:
     * 
     * 	1. "no"
     * 	The traditional Spring default. No automagical wiring. Bean references
     * 	must be defined in the XML file via the <ref/> element (or "ref"
     * 	attribute). We recommend this in most cases as it makes documentation
     * 	more explicit.
     * 
     * 	Note that this default mode also allows for annotation-driven autowiring,
     * 	if activated. "no" refers to externally driven autowiring only, not
     * 	affecting any autowiring demands that the bean class itself expresses.
     * 
     * 	2. "byName"
     * 	Autowiring by property name. If a bean of class Cat exposes a "dog"
     * 	property, Spring will try to set this to the value of the bean "dog"
     * 	in the current container. If there is no matching bean by name, nothing
     * 	special happens.
     * 
     * 	3. "byType"
     * 	Autowiring if there is exactly one bean of the property type in the
     * 	container. If there is more than one, a fatal error is raised, and
     * 	you cannot use byType autowiring for that bean. If there is none,
     * 	nothing special happens.
     * 
     * 	4. "constructor"
     * 	Analogous to "byType" for constructor arguments. If there is not exactly
     * 	one bean of the constructor argument type in the bean factory, a fatal
     * 	error is raised.
     * 
     * 	Note that explicit dependencies, i.e. "property" and "constructor-arg"
     * 	elements, always override autowiring.
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per concrete bean definition. It can be
     * 	shared through the 'default-autowire' attribute at the 'beans' level
     * 	and potentially inherited from outer 'beans' defaults in case of nested
     * 	'beans' sections (e.g. with different profiles).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutowire() {
        if (autowire == null) {
            return "default";
        } else {
            return autowire;
        }
    }

    /**
     * Définit la valeur de la propriété autowire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAutowire()
     */
    public void setAutowire(String value) {
        this.autowire = value;
    }

    /**
     * The names of the beans that this bean depends on being initialized.
     * 	The bean factory will guarantee that these beans get initialized
     * 	before this bean.
     * 
     * 	Note that dependencies are normally expressed through bean properties
     * 	or constructor arguments. This property should just be necessary for
     * 	other kinds of dependencies like statics (*ugh*) or database preparation
     * 	on startup.
     * 
     * 	Note: This attribute will not be inherited by child bean definitions.
     * 	Hence, it needs to be specified per concrete bean definition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependsOn() {
        return dependsOn;
    }

    /**
     * Définit la valeur de la propriété dependsOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDependsOn()
     */
    public void setDependsOn(String value) {
        this.dependsOn = value;
    }

    /**
     * Indicates whether or not this bean should be considered when looking
     * 	for matching candidates to satisfy another bean's autowiring requirements.
     * 	Note that this does not affect explicit references by name, which will get
     * 	resolved even if the specified bean is not marked as an autowire candidate.
     * 
     * @return
     *     possible object is
     *     {@link DefaultableBoolean }
     *     
     */
    public DefaultableBoolean getAutowireCandidate() {
        if (autowireCandidate == null) {
            return DefaultableBoolean.DEFAULT;
        } else {
            return autowireCandidate;
        }
    }

    /**
     * Définit la valeur de la propriété autowireCandidate.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultableBoolean }
     *     
     * @see #getAutowireCandidate()
     */
    public void setAutowireCandidate(DefaultableBoolean value) {
        this.autowireCandidate = value;
    }

    /**
     * Specifies that this bean should be given preference when multiple
     * 	candidates are qualified to autowire a single-valued dependency.
     * 	If exactly one 'primary' bean exists among the candidates, it
     * 	will be the autowired value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Définit la valeur de la propriété primary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPrimary()
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

    /**
     * The name of the custom initialization method to invoke after setting
     * 	bean properties. The method must have no arguments, but may throw any
     * 	exception.
     * 
     * 	This is an alternative to implementing Spring's InitializingBean
     * 	interface or marking a method with the PostConstruct annotation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitMethod() {
        return initMethod;
    }

    /**
     * Définit la valeur de la propriété initMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInitMethod()
     */
    public void setInitMethod(String value) {
        this.initMethod = value;
    }

    /**
     * The name of the custom destroy method to invoke on bean factory shutdown.
     * 	The method must have no arguments, but may throw any exception.
     * 
     * 	This is an alternative to implementing Spring's DisposableBean
     * 	interface or the standard Java Closeable/AutoCloseable interface,
     * 	or marking a method with the PreDestroy annotation.
     * 
     * 	Note: Only invoked on beans whose lifecycle is under the full
     * 	control of the factory - which is always the case for singletons,
     * 	but not guaranteed for any other scope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestroyMethod() {
        return destroyMethod;
    }

    /**
     * Définit la valeur de la propriété destroyMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestroyMethod()
     */
    public void setDestroyMethod(String value) {
        this.destroyMethod = value;
    }

    /**
     * The name of a factory method to use to create this object. Use
     * 	constructor-arg elements to specify arguments to the factory method,
     * 	if it takes arguments. Autowiring does not apply to factory methods.
     * 
     * 	If the "class" attribute is present, the factory method will be a static
     * 	method on the class specified by the "class" attribute on this bean
     * 	definition. Often this will be the same class as that of the constructed
     * 	object - for example, when the factory method is used as an alternative
     * 	to a constructor. However, it may be on a different class. In that case,
     * 	the created object will *not* be of the class specified in the "class"
     * 	attribute. This is analogous to FactoryBean behavior.
     * 
     * 	If the "factory-bean" attribute is present, the "class" attribute is not
     * 	used, and the factory method will be an instance method on the object
     * 	returned from a getBean call with the specified bean name. The factory
     * 	bean may be defined as a singleton or a prototype.
     * 
     * 	The factory method can have any number of arguments. Autowiring is not
     * 	supported. Use indexed constructor-arg elements in conjunction with the
     * 	factory-method attribute.
     * 
     * 	Setter Injection can be used in conjunction with a factory method.
     * 	Method Injection cannot, as the factory method returns an instance,
     * 	which will be used when the container creates the bean.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryMethod() {
        return factoryMethod;
    }

    /**
     * Définit la valeur de la propriété factoryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFactoryMethod()
     */
    public void setFactoryMethod(String value) {
        this.factoryMethod = value;
    }

    /**
     * Alternative to class attribute for factory-method usage.
     * 	If this is specified, no class attribute should be used.
     * 	This must be set to the name of a bean in the current or
     * 	ancestor factories that contains the relevant factory method.
     * 	This allows the factory itself to be configured using Dependency
     * 	Injection, and an instance (rather than static) method to be used.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryBean() {
        return factoryBean;
    }

    /**
     * Définit la valeur de la propriété factoryBean.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFactoryBean()
     */
    public void setFactoryBean(String value) {
        this.factoryBean = value;
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
