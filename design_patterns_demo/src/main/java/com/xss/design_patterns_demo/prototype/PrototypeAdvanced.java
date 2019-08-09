package com.xss.design_patterns_demo.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: PrototypeAdvanced
 * @Description: 高级原型模式
 * @author: TC20014
 * @date: 2019/8/6 14:42
 * @Version: 1.0
 */
public class PrototypeAdvanced implements Cloneable{

    private ArrayList<String> list = new ArrayList<>();

    /**
     * 使用clone方式拷贝，非基本数据类型，无法拷贝。
     * @return
     */
    @Override
    protected PrototypeAdvanced clone() {
        PrototypeAdvanced advanced = null;
        try {
            advanced = (PrototypeAdvanced)super.clone();
            // 拷贝非基本数据类型时，应该考虑将引用对象也拷贝一份。但如果引用对象中还存在着引用对象，那么它还是成功的吗？
            // 不会，如果list中存储的数据类型依旧为引用类型，那么拷贝的也是引用对象的地址值，而非数据值。
            // 同样的，clone方法是无法拷贝final标记的类、属性等
            advanced.list = (ArrayList)this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return advanced;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(String value) {
        this.list.add(value);
    }

}
