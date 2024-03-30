package com.whatsapp.protocol;

import X.AnonymousClass1AL;
import X.C203399nx;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoipStanzaChildNode {
    public final AnonymousClass1AL[] attributes;
    public final VoipStanzaChildNode[] children;
    public final byte[] data;
    public final String tag;

    public class Builder {
        public Map attributes;
        public List children;
        public byte[] data;
        public final String tag;

        private Builder addAttribute(String str, AnonymousClass1AL r4) {
            Map map = this.attributes;
            if (map == null) {
                map = new HashMap();
                this.attributes = map;
            }
            if (map.put(str, r4) == null) {
                return this;
            }
            throw new IllegalArgumentException("node may not have duplicate attributes");
        }

        public Builder addAttributes(AnonymousClass1AL[] r5) {
            if (r5 != null) {
                for (AnonymousClass1AL r0 : r5) {
                    addAttribute(r0.A02, r0.A03);
                }
            }
            return this;
        }

        public Builder addChild(VoipStanzaChildNode voipStanzaChildNode) {
            if (this.data == null) {
                List list = this.children;
                if (list == null) {
                    list = new ArrayList();
                    this.children = list;
                }
                list.add(voipStanzaChildNode);
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }

        public Builder addChildren(VoipStanzaChildNode[] voipStanzaChildNodeArr) {
            if (voipStanzaChildNodeArr != null) {
                for (VoipStanzaChildNode addChild : voipStanzaChildNodeArr) {
                    addChild(addChild);
                }
            }
            return this;
        }

        public VoipStanzaChildNode build() {
            AnonymousClass1AL[] r5;
            int size;
            Map map = this.attributes;
            VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
            if (map == null || (size = map.size()) <= 0) {
                r5 = null;
            } else {
                AnonymousClass1AL[] r52 = new AnonymousClass1AL[size];
                int i = 0;
                for (Map.Entry value : this.attributes.entrySet()) {
                    r52[i] = value.getValue();
                    i++;
                }
                r5 = r52;
            }
            List list = this.children;
            if (list != null) {
                voipStanzaChildNodeArr = (VoipStanzaChildNode[]) list.toArray(new VoipStanzaChildNode[0]);
            }
            return new VoipStanzaChildNode(this.tag, r5, voipStanzaChildNodeArr, this.data);
        }

        public Builder setData(byte[] bArr) {
            if (this.children == null) {
                this.data = bArr;
                return this;
            }
            throw new IllegalArgumentException("node may not have both data and children");
        }

        public Builder(String str) {
            this.tag = str;
        }

        public Builder addAttribute(String str, Jid jid) {
            addAttribute(str, new AnonymousClass1AL(jid, str));
            return this;
        }

        public Builder addAttribute(String str, String str2) {
            addAttribute(str, new AnonymousClass1AL(str, str2));
            return this;
        }
    }

    public static VoipStanzaChildNode fromProtocolTreeNode(C203399nx r7) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        C203399nx[] r6 = r7.A02;
        if (r6 != null) {
            int length = r6.length;
            voipStanzaChildNodeArr = new VoipStanzaChildNode[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                voipStanzaChildNodeArr[i2] = fromProtocolTreeNode(r6[i]);
                i++;
                i2++;
            }
        } else {
            voipStanzaChildNodeArr = null;
        }
        return new VoipStanzaChildNode(r7.A00, r7.A0k(), voipStanzaChildNodeArr, r7.A01);
    }

    public AnonymousClass1AL[] getAttributesCopy() {
        AnonymousClass1AL[] r1 = this.attributes;
        if (r1 != null) {
            return (AnonymousClass1AL[]) Arrays.copyOf(r1, r1.length);
        }
        return null;
    }

    public Object[] getAttributesFlattedCopy() {
        AnonymousClass1AL[] r7 = this.attributes;
        if (r7 == null) {
            return null;
        }
        Object[] objArr = new Object[(r6 * 2)];
        int i = 0;
        for (AnonymousClass1AL r2 : r7) {
            int i2 = i + 1;
            objArr[i] = r2.A02;
            Object obj = r2.A01;
            i = i2 + 1;
            if (obj == null) {
                obj = r2.A03;
            }
            objArr[i2] = obj;
        }
        return objArr;
    }

    public VoipStanzaChildNode[] getChildrenCopy() {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr != null) {
            return (VoipStanzaChildNode[]) Arrays.copyOf(voipStanzaChildNodeArr, voipStanzaChildNodeArr.length);
        }
        return null;
    }

    public byte[] getDataCopy() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public AnonymousClass1AL getFirstAttributeByName(String str) {
        AnonymousClass1AL[] r4 = this.attributes;
        if (r4 == null) {
            return null;
        }
        for (AnonymousClass1AL r1 : r4) {
            if (r1.A02.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public VoipStanzaChildNode getFirstChildByTag(String str) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null) {
            return null;
        }
        for (VoipStanzaChildNode voipStanzaChildNode : voipStanzaChildNodeArr) {
            if (voipStanzaChildNode.tag.equals(str)) {
                return voipStanzaChildNode;
            }
        }
        return null;
    }

    public boolean hasAttribute(AnonymousClass1AL r6) {
        AnonymousClass1AL[] r4 = this.attributes;
        if (r4 != null) {
            for (AnonymousClass1AL equals : r4) {
                if (equals.equals(r6)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C203399nx toProtocolTreeNode() {
        int length;
        byte[] bArr = this.data;
        if (bArr != null) {
            return new C203399nx(this.tag, bArr, this.attributes);
        }
        C203399nx[] r6 = null;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null || (length = voipStanzaChildNodeArr.length) <= 0) {
            return new C203399nx(this.tag, this.attributes, r6);
        }
        r6 = new C203399nx[length];
        int i = 0;
        int i2 = 0;
        do {
            r6[i2] = voipStanzaChildNodeArr[i].toProtocolTreeNode();
            i++;
            i2++;
        } while (i < length);
        return new C203399nx(this.tag, this.attributes, r6);
    }

    public String getTag() {
        return this.tag;
    }

    public VoipStanzaChildNode(String str, AnonymousClass1AL[] r2, VoipStanzaChildNode[] voipStanzaChildNodeArr, byte[] bArr) {
        this.tag = str;
        this.attributes = r2;
        this.children = voipStanzaChildNodeArr;
        this.data = bArr;
    }
}
