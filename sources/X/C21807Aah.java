package X;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.Aah  reason: case insensitive filesystem */
public class C21807Aah implements Attributes {
    public XmlPullParser A00;
    public final /* synthetic */ C203809ou A01;

    public int getIndex(String str) {
        return -1;
    }

    public int getIndex(String str, String str2) {
        return -1;
    }

    public String getType(int i) {
        return null;
    }

    public String getType(String str) {
        return null;
    }

    public String getType(String str, String str2) {
        return null;
    }

    public String getValue(String str) {
        return null;
    }

    public String getValue(String str, String str2) {
        return null;
    }

    public C21807Aah(C203809ou r1, XmlPullParser xmlPullParser) {
        this.A01 = r1;
        this.A00 = xmlPullParser;
    }

    public int getLength() {
        return this.A00.getAttributeCount();
    }

    public String getLocalName(int i) {
        return this.A00.getAttributeName(i);
    }

    public String getQName(int i) {
        XmlPullParser xmlPullParser = this.A00;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(xmlPullParser.getAttributePrefix(i));
        return C90464aC.A0f(attributeName, A0u, ':');
    }

    public String getURI(int i) {
        return this.A00.getAttributeNamespace(i);
    }

    public String getValue(int i) {
        return this.A00.getAttributeValue(i);
    }
}
