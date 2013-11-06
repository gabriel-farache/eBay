
package dbws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "operation", namespace = "http://dbws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", namespace = "http://dbws/", propOrder = {
    "filename",
    "data",
    "append"
})
public class Operation {

    @XmlElement(name = "filename", namespace = "")
    private String filename;
    @XmlElement(name = "data", namespace = "")
    private String data;
    @XmlElement(name = "append", namespace = "")
    private boolean append;

    /**
     * 
     * @return
     *     returns String
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * 
     * @param filename
     *     the value for the filename property
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getData() {
        return this.data;
    }

    /**
     * 
     * @param data
     *     the value for the data property
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * 
     * @return
     *     returns boolean
     */
    public boolean isAppend() {
        return this.append;
    }

    /**
     * 
     * @param append
     *     the value for the append property
     */
    public void setAppend(boolean append) {
        this.append = append;
    }

}
