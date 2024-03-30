package X;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: X.7b0  reason: invalid class name and case insensitive filesystem */
public class C156817b0 extends DefaultHandler {
    public static List A00 = AnonymousClass001.A0I();
    public static List A01 = AnonymousClass001.A0I();
    public static C121995u8 A02;
    public static C120555rh A03;
    public static String A04;

    public C156817b0() {
    }

    public void finalize() {
        System.out.println("KeyParser Destroyed");
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str3.equals("key")) {
            C121995u8 r1 = new C121995u8();
            A02 = r1;
            r1.A00 = attributes.getValue("ki");
            A02.A01 = attributes.getValue("code");
        } else if (str3.equals("param")) {
            C120555rh r12 = new C120555rh();
            A03 = r12;
            r12.A00 = attributes.getValue("code");
            attributes.getValue("owner");
        }
        A04 = "";
    }

    public C156817b0(String str) {
        A01 = AnonymousClass001.A0I();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(str)), this);
        } catch (IOException | ParserConfigurationException | SAXException unused) {
            throw new AnonymousClass5VJ(C023109s.A0G);
        }
    }

    public void characters(char[] cArr, int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A04);
        A04 = AnonymousClass000.A0q(String.copyValueOf(cArr, i, i2).trim(), A0u);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r1.add(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void endElement(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case 106079: goto L_0x000c;
                case 106436749: goto L_0x0019;
                case 444324068: goto L_0x0029;
                case 492250706: goto L_0x0038;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = ""
            A04 = r0
            return
        L_0x000c:
            java.lang.String r0 = "key"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.util.List r1 = A00
            X.5u8 r0 = A02
            goto L_0x0025
        L_0x0019:
            java.lang.String r0 = "param"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.util.List r1 = A01
            X.5rh r0 = A03
        L_0x0025:
            r1.add(r0)
            goto L_0x0007
        L_0x0029:
            java.lang.String r0 = "paramValue"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5rh r1 = A03
            java.lang.String r0 = A04
            r1.A01 = r0
            goto L_0x0007
        L_0x0038:
            java.lang.String r0 = "keyValue"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.5u8 r1 = A02
            java.lang.String r0 = A04
            r1.A02 = r0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156817b0.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
