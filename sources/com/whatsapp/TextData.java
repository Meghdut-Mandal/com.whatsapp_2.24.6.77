package com.whatsapp;

import X.AnonymousClass000;
import X.C36331k8;
import java.io.Serializable;
import java.util.Arrays;

public class TextData implements Serializable {
    public static final long serialVersionUID = 1;
    public int backgroundColor;
    public int fontStyle;
    public int textColor;
    public byte[] thumbnail;

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1J(objArr, this.fontStyle);
        AnonymousClass000.A1K(objArr, this.textColor);
        C36331k8.A1V(objArr, this.backgroundColor);
        objArr[3] = this.thumbnail;
        return Arrays.deepHashCode(objArr);
    }

    public boolean equals(Object obj) {
        int length;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextData textData = (TextData) obj;
        if (this.fontStyle != textData.fontStyle || this.textColor != textData.textColor || this.backgroundColor != textData.backgroundColor) {
            return false;
        }
        byte[] bArr = this.thumbnail;
        byte[] bArr2 = textData.thumbnail;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null) {
            length = bArr2.length;
        } else if (bArr2 != null) {
            return Arrays.equals(bArr, bArr2);
        } else {
            length = bArr.length;
        }
        if (length != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextData; fontStyle=");
        A0u.append(this.fontStyle);
        A0u.append("; textColor=");
        A0u.append(this.textColor);
        A0u.append("; backgroundColor=");
        A0u.append(this.backgroundColor);
        A0u.append("; thumbnail=");
        byte[] bArr = this.thumbnail;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        return AnonymousClass000.A0o(valueOf, A0u);
    }
}
