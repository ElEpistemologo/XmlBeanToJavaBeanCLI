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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour propsType complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="propsType">
 *   <complexContent>
 *     <extension base="{http://www.springframework.org/schema/beans}collectionType">
 *       <sequence>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{http://www.springframework.org/schema/beans}prop"/>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propsType", propOrder = {
    "prop"
})
@XmlSeeAlso({
    Props.class
})
public class PropsType
    extends CollectionType
{

    protected List<Prop> prop;

    /**
     * Gets the value of the prop property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prop property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prop }
     * </p>
     * 
     * 
     * @return
     *     The value of the prop property.
     */
    public List<Prop> getProp() {
        if (prop == null) {
            prop = new ArrayList<>();
        }
        return this.prop;
    }

}
