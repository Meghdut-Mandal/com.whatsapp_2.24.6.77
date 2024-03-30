package com.facebook.jni;

import X.AnonymousClass000;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorHelper {
    public final Iterator mIterator;
    public Object mKey;
    public Object mValue;

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(this.mIterator);
            this.mKey = A11.getKey();
            this.mValue = A11.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }

    public MapIteratorHelper(Map map) {
        this.mIterator = AnonymousClass000.A0y(map);
    }
}
