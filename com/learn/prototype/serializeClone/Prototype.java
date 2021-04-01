package com.learn.prototype.serializeClone;

import java.io.*;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.prototype.SerializeClone
 * @ClassName: Prototype
 * @Description:原型类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:37
 * @Version: V1.0
 */
public class Prototype implements Cloneable, Serializable {

    private String id;

    private String name;

    private List<String> address;

    public Prototype deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(this);

        InputStream is = new ByteArrayInputStream(os.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(is);
        return (Prototype) ois.readObject();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "prototype:{id:'"+id+"',name:"+name+"',address:'"+address+"'}";
    }
}
