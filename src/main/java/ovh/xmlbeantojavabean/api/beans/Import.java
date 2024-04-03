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
 *       <attribute name="resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "import")
public class Import {

    /**
     * The relative resource location of the XML (bean definition) file to import,
     * 	for example "myImport.xml" or "includes/myImport.xml" or "../myImport.xml".
     * 
     */
    @XmlAttribute(name = "resource", required = true)
    protected String resource;

    /**
     * The relative resource location of the XML (bean definition) file to import,
     * 	for example "myImport.xml" or "includes/myImport.xml" or "../myImport.xml".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * Définit la valeur de la propriété resource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResource()
     */
    public void setResource(String value) {
        this.resource = value;
    }

}
