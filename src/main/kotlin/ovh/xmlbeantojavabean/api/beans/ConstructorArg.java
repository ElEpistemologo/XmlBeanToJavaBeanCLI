//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.5 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package ovh.xmlbeantojavabean.api.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
 *         <element ref="{http://www.springframework.org/schema/beans}description" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{http://www.springframework.org/schema/beans}bean"/>
 *           <element ref="{http://www.springframework.org/schema/beans}ref"/>
 *           <element ref="{http://www.springframework.org/schema/beans}idref"/>
 *           <element ref="{http://www.springframework.org/schema/beans}value"/>
 *           <element ref="{http://www.springframework.org/schema/beans}null"/>
 *           <element ref="{http://www.springframework.org/schema/beans}array"/>
 *           <element ref="{http://www.springframework.org/schema/beans}list"/>
 *           <element ref="{http://www.springframework.org/schema/beans}set"/>
 *           <element ref="{http://www.springframework.org/schema/beans}map"/>
 *           <element ref="{http://www.springframework.org/schema/beans}props"/>
 *           <any namespace='##other'/>
 *         </choice>
 *       </sequence>
 *       <attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "bean",
    "descriptionRef",
    "idref",
    "descriptionValue",
    "_null",
    "array",
    "list",
    "set",
    "map",
    "props",
    "any"
})
@XmlRootElement(name = "constructor-arg")
public class ConstructorArg {

    /**
     * Contains informative text describing the purpose of the enclosing element.
     * 	Used primarily for user documentation of XML bean definition documents.
     * 
     */
    protected Description description;
    /**
     * Defines a single (usually named) bean.
     * 
     * 	A bean definition may contain nested tags for constructor arguments,
     * 	property values, lookup methods, and replaced methods. Mixing constructor
     * 	injection and setter injection on the same bean is explicitly supported.
     * 
     */
    protected Bean bean;
    @XmlElement(name = "ref")
    protected Ref descriptionRef;
    /**
     * The id of another bean in this factory or an external factory
     * 	(parent or included factory).
     * 	While a regular 'value' element could instead be used for the
     * 	same effect, using idref indicates that the Spring container
     * 	should check that the value actually corresponds to a bean id.
     * 
     */
    protected Idref idref;
    @XmlElement(name = "value")
    protected Value descriptionValue;
    /**
     * Denotes a Java null value. Necessary because an empty "value" tag
     * 	will resolve to an empty String, which will not be resolved to a
     * 	null value unless a special PropertyEditor does so.
     * 
     */
    @XmlElement(name = "null")
    protected Null _null;
    /**
     * An array can contain multiple inner bean, ref, collection, or value elements.
     * 	This configuration element will always result in an array, even when being
     * 	defined e.g. as a value for a map with value type Object.
     * 
     */
    protected Array array;
    /**
     * A list can contain multiple inner bean, ref, collection, or value elements.
     * 	A list can also map to an array type; the necessary conversion is performed
     * 	automatically.
     * 
     */
    protected List list;
    /**
     * A set can contain multiple inner bean, ref, collection, or value elements.
     * 
     */
    protected Set set;
    /**
     * A mapping from a key to an object. Maps may be empty.
     * 
     */
    protected Map map;
    /**
     * Props elements differ from map elements in that values must be strings.
     * 	Props may be empty.
     * 
     */
    protected Props props;
    @XmlAnyElement(lax = true)
    protected Object any;
    /**
     * The exact index of the argument in the constructor argument list.
     * 	Only needed to avoid ambiguities, e.g. in case of 2 arguments of
     * 	the exact same type.
     * 
     */
    @XmlAttribute(name = "index")
    protected String index;
    /**
     * The exact type of the constructor argument. Only needed to avoid
     * 	ambiguities, e.g. in case of 2 single argument constructors
     * 	that can both be converted from a String.
     * 
     */
    @XmlAttribute(name = "type")
    protected String type;
    /**
     * The exact name of the argument in the constructor argument list.
     * 	Only needed to avoid ambiguities, e.g. in case of 2 arguments of
     * 	the exact same type. Note: This requires debug symbols to be
     * 	stored in the class file in order to introspect argument names!
     * 
     */
    @XmlAttribute(name = "name")
    protected String name;
    /**
     * A short-cut alternative to a nested "<ref bean='...'/>" element.
     * 
     */
    @XmlAttribute(name = "ref")
    protected String ref;
    /**
     * A short-cut alternative to a nested "<value>...<value/>" element.
     * 
     */
    @XmlAttribute(name = "value")
    protected String value;

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
     * Defines a single (usually named) bean.
     * 
     * 	A bean definition may contain nested tags for constructor arguments,
     * 	property values, lookup methods, and replaced methods. Mixing constructor
     * 	injection and setter injection on the same bean is explicitly supported.
     * 
     * @return
     *     possible object is
     *     {@link Bean }
     *     
     */
    public Bean getBean() {
        return bean;
    }

    /**
     * Définit la valeur de la propriété bean.
     * 
     * @param value
     *     allowed object is
     *     {@link Bean }
     *     
     * @see #getBean()
     */
    public void setBean(Bean value) {
        this.bean = value;
    }

    /**
     * Obtient la valeur de la propriété descriptionRef.
     * 
     * @return
     *     possible object is
     *     {@link Ref }
     *     
     */
    public Ref getDescriptionRef() {
        return descriptionRef;
    }

    /**
     * Définit la valeur de la propriété descriptionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Ref }
     *     
     */
    public void setDescriptionRef(Ref value) {
        this.descriptionRef = value;
    }

    /**
     * The id of another bean in this factory or an external factory
     * 	(parent or included factory).
     * 	While a regular 'value' element could instead be used for the
     * 	same effect, using idref indicates that the Spring container
     * 	should check that the value actually corresponds to a bean id.
     * 
     * @return
     *     possible object is
     *     {@link Idref }
     *     
     */
    public Idref getIdref() {
        return idref;
    }

    /**
     * Définit la valeur de la propriété idref.
     * 
     * @param value
     *     allowed object is
     *     {@link Idref }
     *     
     * @see #getIdref()
     */
    public void setIdref(Idref value) {
        this.idref = value;
    }

    /**
     * Obtient la valeur de la propriété descriptionValue.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getDescriptionValue() {
        return descriptionValue;
    }

    /**
     * Définit la valeur de la propriété descriptionValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setDescriptionValue(Value value) {
        this.descriptionValue = value;
    }

    /**
     * Denotes a Java null value. Necessary because an empty "value" tag
     * 	will resolve to an empty String, which will not be resolved to a
     * 	null value unless a special PropertyEditor does so.
     * 
     * @return
     *     possible object is
     *     {@link Null }
     *     
     */
    public Null getNull() {
        return _null;
    }

    /**
     * Définit la valeur de la propriété null.
     * 
     * @param value
     *     allowed object is
     *     {@link Null }
     *     
     * @see #getNull()
     */
    public void setNull(Null value) {
        this._null = value;
    }

    /**
     * An array can contain multiple inner bean, ref, collection, or value elements.
     * 	This configuration element will always result in an array, even when being
     * 	defined e.g. as a value for a map with value type Object.
     * 
     * @return
     *     possible object is
     *     {@link Array }
     *     
     */
    public Array getArray() {
        return array;
    }

    /**
     * Définit la valeur de la propriété array.
     * 
     * @param value
     *     allowed object is
     *     {@link Array }
     *     
     * @see #getArray()
     */
    public void setArray(Array value) {
        this.array = value;
    }

    /**
     * A list can contain multiple inner bean, ref, collection, or value elements.
     * 	A list can also map to an array type; the necessary conversion is performed
     * 	automatically.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getList() {
        return list;
    }

    /**
     * Définit la valeur de la propriété list.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     * @see #getList()
     */
    public void setList(List value) {
        this.list = value;
    }

    /**
     * A set can contain multiple inner bean, ref, collection, or value elements.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getSet() {
        return set;
    }

    /**
     * Définit la valeur de la propriété set.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     * @see #getSet()
     */
    public void setSet(Set value) {
        this.set = value;
    }

    /**
     * A mapping from a key to an object. Maps may be empty.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Définit la valeur de la propriété map.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     * @see #getMap()
     */
    public void setMap(Map value) {
        this.map = value;
    }

    /**
     * Props elements differ from map elements in that values must be strings.
     * 	Props may be empty.
     * 
     * @return
     *     possible object is
     *     {@link Props }
     *     
     */
    public Props getProps() {
        return props;
    }

    /**
     * Définit la valeur de la propriété props.
     * 
     * @param value
     *     allowed object is
     *     {@link Props }
     *     
     * @see #getProps()
     */
    public void setProps(Props value) {
        this.props = value;
    }

    /**
     * Obtient la valeur de la propriété any.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Définit la valeur de la propriété any.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * The exact index of the argument in the constructor argument list.
     * 	Only needed to avoid ambiguities, e.g. in case of 2 arguments of
     * 	the exact same type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Définit la valeur de la propriété index.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIndex()
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * The exact type of the constructor argument. Only needed to avoid
     * 	ambiguities, e.g. in case of 2 single argument constructors
     * 	that can both be converted from a String.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * The exact name of the argument in the constructor argument list.
     * 	Only needed to avoid ambiguities, e.g. in case of 2 arguments of
     * 	the exact same type. Note: This requires debug symbols to be
     * 	stored in the class file in order to introspect argument names!
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
     * A short-cut alternative to a nested "<ref bean='...'/>" element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Définit la valeur de la propriété ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRef()
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * A short-cut alternative to a nested "<value>...<value/>" element.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

}
