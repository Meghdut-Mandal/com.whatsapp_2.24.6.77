package org.apache.xml.security;

import X.C165577te;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Init {
    public static Log a;
    public static Class b;
    public static boolean c = false;

    static {
        Class a2 = a("org.apache.xml.security.Init");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public static final boolean a() {
        return c;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x018d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void b() {
        /*
            java.lang.Class<org.apache.xml.security.Init> r37 = org.apache.xml.security.Init.class
            monitor-enter(r37)
            boolean r0 = c     // Catch:{ all -> 0x04c1 }
            if (r0 != 0) goto L_0x04bf
            r0 = 1
            long r40 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            long r44 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            long r42 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            long r48 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            javax.xml.parsers.DocumentBuilderFactory r1 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ Exception -> 0x04b1 }
            r1.setNamespaceAware(r0)     // Catch:{ Exception -> 0x04b1 }
            r0 = 0
            r1.setValidating(r0)     // Catch:{ Exception -> 0x04b1 }
            javax.xml.parsers.DocumentBuilder r1 = r1.newDocumentBuilder()     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.Init$1 r0 = new org.apache.xml.security.Init$1     // Catch:{ Exception -> 0x04b1 }
            r0.<init>()     // Catch:{ Exception -> 0x04b1 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ Exception -> 0x04b1 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x04b1 }
            org.w3c.dom.Document r0 = r1.parse(r0)     // Catch:{ Exception -> 0x04b1 }
            long r46 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            long r52 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.keys.KeyInfo.a()     // Catch:{ Exception -> 0x04ac }
            long r50 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.w3c.dom.Node r2 = r0.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
        L_0x0049:
            if (r2 == 0) goto L_0x005c
            java.lang.String r1 = "Configuration"
            java.lang.String r0 = r2.getLocalName()     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 != 0) goto L_0x005c
            org.w3c.dom.Node r2 = r2.getNextSibling()     // Catch:{ Exception -> 0x04b1 }
            goto L_0x0049
        L_0x005c:
            org.w3c.dom.Node r54 = r2.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
            r17 = 0
            r21 = 0
            r9 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r11 = 0
            r29 = 0
            r19 = 0
            r31 = 0
            r15 = 0
            r33 = 0
            r6 = 0
            r38 = 0
            r4 = 0
            r35 = 0
        L_0x0080:
            if (r54 == 0) goto L_0x03ac
            short r1 = r54.getNodeType()     // Catch:{ Exception -> 0x04b1 }
            r0 = 1
            if (r0 != r1) goto L_0x03a6
            java.lang.String r8 = r54.getLocalName()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "ResourceBundles"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x00c1
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            r1 = r54
            org.w3c.dom.Element r1 = (org.w3c.dom.Element) r1     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "defaultLanguageCode"
            org.w3c.dom.Attr r2 = r1.getAttributeNode(r0)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "defaultCountryCode"
            org.w3c.dom.Attr r0 = r1.getAttributeNode(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r2 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            java.lang.String r1 = r2.getNodeValue()     // Catch:{ Exception -> 0x04b1 }
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r0 != 0) goto L_0x00b6
            r0 = 0
            goto L_0x00ba
        L_0x00b6:
            java.lang.String r0 = r0.getNodeValue()     // Catch:{ Exception -> 0x04b1 }
        L_0x00ba:
            org.apache.xml.security.utils.I18n.a((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x04b1 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
        L_0x00c1:
            java.lang.String r0 = "CanonicalizationMethods"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x0133
            long r23 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.c14n.Canonicalizer.a()     // Catch:{ Exception -> 0x04b1 }
            org.w3c.dom.Node r2 = r54.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r1 = "http://www.xmlsecurity.org/NS/#configuration"
            java.lang.String r0 = "CanonicalizationMethod"
            org.w3c.dom.Element[] r13 = org.apache.xml.security.utils.XMLUtils.a((org.w3c.dom.Node) r2, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x04b1 }
            r10 = 0
        L_0x00dd:
            int r0 = r13.length     // Catch:{ Exception -> 0x04b1 }
            if (r10 >= r0) goto L_0x012f
            r1 = r13[r10]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "URI"
            r2 = 0
            java.lang.String r9 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            r1 = r13[r10]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "JAVACLASS"
            java.lang.String r3 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x011b }
            org.apache.commons.logging.Log r0 = a     // Catch:{ ClassNotFoundException -> 0x011b }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ ClassNotFoundException -> 0x011b }
            if (r0 == 0) goto L_0x0117
            org.apache.commons.logging.Log r2 = a     // Catch:{ ClassNotFoundException -> 0x011b }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ ClassNotFoundException -> 0x011b }
            java.lang.String r0 = "Canonicalizer.register("
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x011b }
            r1.append(r9)     // Catch:{ ClassNotFoundException -> 0x011b }
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x011b }
            r1.append(r3)     // Catch:{ ClassNotFoundException -> 0x011b }
            java.lang.String r0 = ")"
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ ClassNotFoundException -> 0x011b }
        L_0x0117:
            org.apache.xml.security.c14n.Canonicalizer.a((java.lang.String) r9, (java.lang.String) r3)     // Catch:{ ClassNotFoundException -> 0x011b }
            goto L_0x012c
        L_0x011b:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x04b1 }
            X.C36331k8.A1N(r9, r3, r0)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r1 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r2 = "algorithm.classDoesNotExist"
            java.lang.String r0 = org.apache.xml.security.utils.I18n.b((java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ Exception -> 0x04b1 }
            r1.fatal(r0)     // Catch:{ Exception -> 0x04b1 }
        L_0x012c:
            int r10 = r10 + 1
            goto L_0x00dd
        L_0x012f:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
        L_0x0133:
            java.lang.String r0 = "TransformAlgorithms"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x01ae
            long r35 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.transforms.Transform.a()     // Catch:{ Exception -> 0x04b1 }
            org.w3c.dom.Node r2 = r54.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r1 = "http://www.xmlsecurity.org/NS/#configuration"
            java.lang.String r0 = "TransformAlgorithm"
            org.w3c.dom.Element[] r13 = org.apache.xml.security.utils.XMLUtils.a((org.w3c.dom.Node) r2, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x04b1 }
            r5 = 0
        L_0x014f:
            int r0 = r13.length     // Catch:{ Exception -> 0x04b1 }
            if (r5 >= r0) goto L_0x01aa
            r1 = r13[r5]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "URI"
            r2 = 0
            java.lang.String r4 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            r1 = r13[r5]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "JAVACLASS"
            java.lang.String r3 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            org.apache.commons.logging.Log r0 = a     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            if (r0 == 0) goto L_0x0189
            org.apache.commons.logging.Log r2 = a     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            java.lang.String r0 = "Transform.register("
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            r1.append(r4)     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            r1.append(r3)     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            java.lang.String r0 = ")"
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
        L_0x0189:
            org.apache.xml.security.transforms.Transform.a((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ ClassNotFoundException -> 0x0195, NoClassDefFoundError -> 0x018d }
            goto L_0x01a7
        L_0x018d:
            org.apache.commons.logging.Log r1 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Not able to found dependecies for algorithm, I'm keep working."
            r1.warn(r0)     // Catch:{ Exception -> 0x04b1 }
            goto L_0x01a7
        L_0x0195:
            java.lang.Object[] r0 = X.AnonymousClass001.A0M()     // Catch:{ Exception -> 0x04b1 }
            X.C36331k8.A1N(r4, r3, r0)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r1 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r2 = "algorithm.classDoesNotExist"
            java.lang.String r0 = org.apache.xml.security.utils.I18n.b((java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ Exception -> 0x04b1 }
            r1.fatal(r0)     // Catch:{ Exception -> 0x04b1 }
        L_0x01a7:
            int r5 = r5 + 1
            goto L_0x014f
        L_0x01aa:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
        L_0x01ae:
            java.lang.String r0 = "JCEAlgorithmMappings"
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x01c5
            long r27 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            r0 = r54
            org.w3c.dom.Element r0 = (org.w3c.dom.Element) r0     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.algorithms.JCEMapper.a((org.w3c.dom.Element) r0)     // Catch:{ Exception -> 0x04b1 }
            long r25 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
        L_0x01c5:
            java.lang.String r0 = "SignatureAlgorithms"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x0237
            long r38 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.algorithms.SignatureAlgorithm.h()     // Catch:{ Exception -> 0x04b1 }
            org.w3c.dom.Node r2 = r54.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r1 = "http://www.xmlsecurity.org/NS/#configuration"
            java.lang.String r0 = "SignatureAlgorithm"
            org.w3c.dom.Element[] r13 = org.apache.xml.security.utils.XMLUtils.a((org.w3c.dom.Node) r2, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x04b1 }
            r7 = 0
        L_0x01e1:
            int r0 = r13.length     // Catch:{ Exception -> 0x04b1 }
            if (r7 >= r0) goto L_0x0233
            r1 = r13[r7]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "URI"
            r2 = 0
            java.lang.String r6 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            r1 = r13[r7]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "JAVACLASS"
            java.lang.String r3 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x021f }
            org.apache.commons.logging.Log r0 = a     // Catch:{ ClassNotFoundException -> 0x021f }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ ClassNotFoundException -> 0x021f }
            if (r0 == 0) goto L_0x021b
            org.apache.commons.logging.Log r2 = a     // Catch:{ ClassNotFoundException -> 0x021f }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ ClassNotFoundException -> 0x021f }
            java.lang.String r0 = "SignatureAlgorithm.register("
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x021f }
            r1.append(r6)     // Catch:{ ClassNotFoundException -> 0x021f }
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x021f }
            r1.append(r3)     // Catch:{ ClassNotFoundException -> 0x021f }
            java.lang.String r0 = ")"
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ ClassNotFoundException -> 0x021f }
        L_0x021b:
            org.apache.xml.security.algorithms.SignatureAlgorithm.a(r6, r3)     // Catch:{ ClassNotFoundException -> 0x021f }
            goto L_0x0230
        L_0x021f:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x04b1 }
            X.C36331k8.A1N(r6, r3, r0)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r1 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r2 = "algorithm.classDoesNotExist"
            java.lang.String r0 = org.apache.xml.security.utils.I18n.b((java.lang.String) r2, (java.lang.Object[]) r0)     // Catch:{ Exception -> 0x04b1 }
            r1.fatal(r0)     // Catch:{ Exception -> 0x04b1 }
        L_0x0230:
            int r7 = r7 + 1
            goto L_0x01e1
        L_0x0233:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
        L_0x0237:
            java.lang.String r0 = "ResourceResolvers"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x02ca
            long r33 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.utils.resolver.ResourceResolver.a()     // Catch:{ Exception -> 0x04b1 }
            org.w3c.dom.Node r2 = r54.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r1 = "http://www.xmlsecurity.org/NS/#configuration"
            java.lang.String r0 = "Resolver"
            org.w3c.dom.Element[] r14 = org.apache.xml.security.utils.XMLUtils.a((org.w3c.dom.Node) r2, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x04b1 }
            r13 = 0
        L_0x0253:
            int r0 = r14.length     // Catch:{ Exception -> 0x04b1 }
            if (r13 >= r0) goto L_0x02ca
            r1 = r14[r13]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "JAVACLASS"
            r2 = 0
            java.lang.String r15 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            r1 = r14[r13]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "DESCRIPTION"
            java.lang.String r3 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            if (r3 == 0) goto L_0x028b
            int r0 = r3.length()     // Catch:{ Exception -> 0x04b1 }
            if (r0 <= 0) goto L_0x028b
            org.apache.commons.logging.Log r0 = a     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x02a6
            org.apache.commons.logging.Log r2 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Register Resolver: "
            r1.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r1.append(r15)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = ": "
            X.C165567td.A1O(r0, r3, r1, r2)     // Catch:{ Exception -> 0x04b1 }
            goto L_0x02a6
        L_0x028b:
            org.apache.commons.logging.Log r0 = a     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x02a6
            org.apache.commons.logging.Log r2 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Register Resolver: "
            r1.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r1.append(r15)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = ": For unknown purposes"
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ Exception -> 0x04b1 }
        L_0x02a6:
            r0 = 0
            org.apache.xml.security.utils.resolver.ResourceResolver.a((java.lang.String) r15, (boolean) r0)     // Catch:{ all -> 0x02ab }
            goto L_0x02c3
        L_0x02ab:
            r3 = move-exception
            org.apache.commons.logging.Log r2 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Cannot register:"
            r1.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r1.append(r15)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = " perhaps some needed jars are not installed"
            java.lang.String r0 = X.C165597tg.A0n(r0, r1)     // Catch:{ Exception -> 0x04b1 }
            r2.warn(r0, r3)     // Catch:{ Exception -> 0x04b1 }
        L_0x02c3:
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            int r13 = r13 + 1
            goto L_0x0253
        L_0x02ca:
            java.lang.String r0 = "KeyResolver"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x0343
            long r29 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.xml.security.keys.keyresolver.KeyResolver.a()     // Catch:{ Exception -> 0x04b1 }
            org.w3c.dom.Node r2 = r54.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r1 = "http://www.xmlsecurity.org/NS/#configuration"
            java.lang.String r0 = "Resolver"
            org.w3c.dom.Element[] r12 = org.apache.xml.security.utils.XMLUtils.a((org.w3c.dom.Node) r2, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x04b1 }
            r11 = 0
        L_0x02e6:
            int r0 = r12.length     // Catch:{ Exception -> 0x04b1 }
            if (r11 >= r0) goto L_0x033f
            r1 = r12[r11]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "JAVACLASS"
            r2 = 0
            java.lang.String r3 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            r1 = r12[r11]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "DESCRIPTION"
            java.lang.String r13 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            if (r13 == 0) goto L_0x0323
            int r0 = r13.length()     // Catch:{ Exception -> 0x04b1 }
            if (r0 <= 0) goto L_0x0323
            org.apache.commons.logging.Log r0 = a     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x031d
            org.apache.commons.logging.Log r2 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Register Resolver: "
            r1.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = ": "
            X.C165567td.A1O(r0, r13, r1, r2)     // Catch:{ Exception -> 0x04b1 }
        L_0x031d:
            org.apache.xml.security.keys.keyresolver.KeyResolver.a(r3)     // Catch:{ Exception -> 0x04b1 }
            int r11 = r11 + 1
            goto L_0x02e6
        L_0x0323:
            org.apache.commons.logging.Log r0 = a     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x031d
            org.apache.commons.logging.Log r2 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r1 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Register Resolver: "
            r1.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = ": For unknown purposes"
            X.C165567td.A1Q(r0, r1, r2)     // Catch:{ Exception -> 0x04b1 }
            goto L_0x031d
        L_0x033f:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
        L_0x0343:
            java.lang.String r0 = "PrefixMappings"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x03a6
            long r31 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r0 = a     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x035e
            org.apache.commons.logging.Log r1 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Now I try to bind prefixes:"
            r1.debug(r0)     // Catch:{ Exception -> 0x04b1 }
        L_0x035e:
            org.w3c.dom.Node r2 = r54.getFirstChild()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r1 = "http://www.xmlsecurity.org/NS/#configuration"
            java.lang.String r0 = "PrefixMapping"
            org.w3c.dom.Element[] r14 = org.apache.xml.security.utils.XMLUtils.a((org.w3c.dom.Node) r2, (java.lang.String) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x04b1 }
            r13 = 0
        L_0x036b:
            int r0 = r14.length     // Catch:{ Exception -> 0x04b1 }
            if (r13 >= r0) goto L_0x03a2
            r1 = r14[r13]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "namespace"
            r2 = 0
            java.lang.String r8 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            r1 = r14[r13]     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "prefix"
            java.lang.String r3 = r1.getAttributeNS(r2, r0)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r0 = a     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x039c
            org.apache.commons.logging.Log r19 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r2 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "Now I try to bind "
            r2.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2.append(r3)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r1 = " to "
            r0 = r19
            X.C165567td.A1O(r1, r8, r2, r0)     // Catch:{ Exception -> 0x04b1 }
        L_0x039c:
            org.apache.xml.security.utils.ElementProxy.d(r8, r3)     // Catch:{ Exception -> 0x04b1 }
            int r13 = r13 + 1
            goto L_0x036b
        L_0x03a2:
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
        L_0x03a6:
            org.w3c.dom.Node r54 = r54.getNextSibling()     // Catch:{ Exception -> 0x04b1 }
            goto L_0x0080
        L_0x03ac:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r0 = a     // Catch:{ Exception -> 0x04b1 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ Exception -> 0x04b1 }
            if (r0 == 0) goto L_0x04bc
            org.apache.commons.logging.Log r14 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r13 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "XX_init                             "
            r13.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r0 = r40
            X.C165607th.A1M(r13, r2, r0)     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r8 = " ms"
            X.C165567td.A1Q(r8, r13, r14)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r14 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r13 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_prng                           "
            r13.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2 = r42
            r0 = r44
            X.C165607th.A1M(r13, r2, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r13, r14)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r14 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r13 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_parsing                        "
            r13.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2 = r46
            r0 = r48
            X.C165607th.A1M(r13, r2, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r13, r14)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r14 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r13 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_i18n                 "
            r13.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2 = r17
            r0 = r21
            X.C165607th.A1M(r13, r2, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r13, r14)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r3 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r2 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_c14n             "
            r2.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r0 = r23
            X.C165607th.A1M(r2, r9, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r2, r3)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r10 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r9 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_jcemapper        "
            r9.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2 = r25
            r0 = r27
            X.C165607th.A1M(r9, r2, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r9, r10)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r10 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r9 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_keyInfo          "
            r9.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2 = r50
            r0 = r52
            X.C165607th.A1M(r9, r2, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r9, r10)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r3 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r2 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_keyResolver      "
            r2.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r0 = r29
            X.C165607th.A1M(r2, r11, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r2, r3)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r10 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r9 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_prefixes         "
            r9.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2 = r19
            r0 = r31
            X.C165607th.A1M(r9, r2, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r9, r10)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r10 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r9 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_resourceresolver "
            r9.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r2 = r33
            r0 = r15
            X.C165607th.A1M(r9, r0, r2)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r9, r10)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r3 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r2 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_sigalgos         "
            r2.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r0 = r38
            X.C165607th.A1M(r2, r6, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r2, r3)     // Catch:{ Exception -> 0x04b1 }
            org.apache.commons.logging.Log r3 = a     // Catch:{ Exception -> 0x04b1 }
            java.lang.StringBuffer r2 = X.C165607th.A0x()     // Catch:{ Exception -> 0x04b1 }
            java.lang.String r0 = "  XX_configure_reg_transforms       "
            r2.append(r0)     // Catch:{ Exception -> 0x04b1 }
            r0 = r35
            X.C165607th.A1M(r2, r4, r0)     // Catch:{ Exception -> 0x04b1 }
            X.C165567td.A1Q(r8, r2, r3)     // Catch:{ Exception -> 0x04b1 }
            goto L_0x04bc
        L_0x04ac:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x04b1 }
            throw r0     // Catch:{ Exception -> 0x04b1 }
        L_0x04b1:
            r2 = move-exception
            org.apache.commons.logging.Log r1 = a     // Catch:{ all -> 0x04c1 }
            java.lang.String r0 = "Bad: "
            r1.fatal(r0, r2)     // Catch:{ all -> 0x04c1 }
            r2.printStackTrace()     // Catch:{ all -> 0x04c1 }
        L_0x04bc:
            r0 = 1
            c = r0     // Catch:{ all -> 0x04c1 }
        L_0x04bf:
            monitor-exit(r37)
            return
        L_0x04c1:
            r0 = move-exception
            monitor-exit(r37)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.Init.b():void");
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }
}
