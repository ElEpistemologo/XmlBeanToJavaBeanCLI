//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.5 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package ovh.xmlbeantojavabean.api.beans;

import java.util.ArrayList;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour entryType complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="entryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://www.springframework.org/schema/beans}key" minOccurs="0"/>
 *         <group ref="{http://www.springframework.org/schema/beans}collectionElements"/>
 *       </sequence>
 *       <attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="key-ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="value-ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="value-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryType", propOrder = {
    "entryTypeKey",
    "description",
    "beanOrRefOrIdref"
})
public class EntryType {

    @XmlElement(name = "key")
    protected Key entryTypeKey;
    /**
     * Contains informative text describing the purpose of the enclosing element.
     * 	Used primarily for user documentation of XML bean definition documents.
     * 
     */
    protected Description description;
    @XmlElementRefs({
        @XmlElementRef(name = "bean", namespace = "http://www.springframework.org/schema/beans", type = Bean.class, required = false),
        @XmlElementRef(name = "ref", namespace = "http://www.springframework.org/schema/beans", type = Ref.class, required = false),
        @XmlElementRef(name = "idref", namespace = "http://www.springframework.org/schema/beans", type = Idref.class, required = false),
        @XmlElementRef(name = "value", namespace = "http://www.springframework.org/schema/beans", type = Value.class, required = false),
        @XmlElementRef(name = "null", namespace = "http://www.springframework.org/schema/beans", type = Null.class, required = false),
        @XmlElementRef(name = "array", namespace = "http://www.springframework.org/schema/beans", type = Array.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.springframework.org/schema/beans", type = ovh.xmlbeantojavabean.api.beans.List.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://www.springframework.org/schema/beans", type = Set.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.springframework.org/schema/beans", type = Map.class, required = false),
        @XmlElementRef(name = "props", namespace = "http://www.springframework.org/schema/beans", type = Props.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected java.util.List<Object> beanOrRefOrIdref;
    /**
     * Each map element must specify its key as attribute or as child element.
     * 	A key attribute is always a String value.
     * 
     */
    @XmlAttribute(name = "key")
    protected String key;
    /**
     * A short-cut alternative to a to a "key" element with a nested
     * 	"<ref bean='...'/>".
     * 
     */
    @XmlAttribute(name = "key-ref")
    protected String keyRef;
    /**
     * A short-cut alternative to a nested "<value>...</value>"
     * 	element.
     * 
     */
    @XmlAttribute(name = "value")
    protected String value;
    /**
     * A short-cut alternative to a nested "<ref bean='...'/>".
     * 
     */
    @XmlAttribute(name = "value-ref")
    protected String valueRef;
    /**
     * A short-cut alternative to a 'type' attribute on a nested
     * 	"<value type='...' >...</value>" element.
     * 
     */
    @XmlAttribute(name = "value-type")
    protected String valueType;

    /**
     * Obtient la valeur de la propriété entryTypeKey.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getEntryTypeKey() {
        return entryTypeKey;
    }

    /**
     * Définit la valeur de la propriété entryTypeKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setEntryTypeKey(Key value) {
        this.entryTypeKey = value;
    }

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
     * Gets the value of the beanOrRefOrIdref property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beanOrRefOrIdref property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBeanOrRefOrIdref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Array }
     * {@link Bean }
     * {@link Idref }
     * {@link ovh.xmlbeantojavabean.api.beans.List }
     * {@link Map }
     * {@link Null }
     * {@link Props }
     * {@link Ref }
     * {@link Set }
     * {@link Value }
     * </p>
     * 
     * 
     * @return
     *     The value of the beanOrRefOrIdref property.
     */
    public java.util.List<Object> getBeanOrRefOrIdref() {
        if (beanOrRefOrIdref == null) {
            beanOrRefOrIdref = new ArrayList<>();
        }
        return this.beanOrRefOrIdref;
    }

    /**
     * Each map element must specify its key as attribute or as child element.
     * 	A key attribute is always a String value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Définit la valeur de la propriété key.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKey()
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * A short-cut alternative to a to a "key" element with a nested
     * 	"<ref bean='...'/>".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyRef() {
        return keyRef;
    }

    /**
     * Définit la valeur de la propriété keyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyRef()
     */
    public void setKeyRef(String value) {
        this.keyRef = value;
    }

    /**
     * A short-cut alternative to a nested "<value>...</value>"
     * 	element.
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

    /**
     * A short-cut alternative to a nested "<ref bean='...'/>".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueRef() {
        return valueRef;
    }

    /**
     * Définit la valeur de la propriété valueRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValueRef()
     */
    public void setValueRef(String value) {
        this.valueRef = value;
    }

    /**
     * A short-cut alternative to a 'type' attribute on a nested
     * 	"<value type='...' >...</value>" element.
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
