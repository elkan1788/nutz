package org.nutz.maplist;

/**
 * 将输入理解成Map+List
 * @author juqkai(juqkai@gmail.com)
 */
public interface MapListCompile<T> {
    public Object compile(T t);
}