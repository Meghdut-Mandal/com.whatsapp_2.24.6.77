package org.apache.xml.security.c14n;

import X.AnonymousClass001;
import X.C36331k8;
import X.C36431kI;
import X.C90514aH;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.xml.security.c14n.implementations.CanonicalizerBase;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.w3c.dom.Node;

public class Canonicalizer {
    public static boolean a;
    public static Map b;
    public CanonicalizerSpi c = null;

    public static final Canonicalizer a(String str) {
        return new Canonicalizer(str);
    }

    public static void a() {
        if (!a) {
            b = new HashMap(10);
            a = true;
        }
    }

    public static Class b(String str) {
        return (Class) b.get(str);
    }

    public byte[] a(Node node) {
        return this.c.a(node);
    }

    public byte[] a(Node node, String str) {
        return this.c.a(node, str);
    }

    public Canonicalizer(String str) {
        try {
            CanonicalizerSpi canonicalizerSpi = (CanonicalizerSpi) b(str).newInstance();
            this.c = canonicalizerSpi;
            canonicalizerSpi.a = true;
        } catch (Exception unused) {
            throw new InvalidCanonicalizerException("signature.Canonicalizer.UnknownCanonicalizer", C36431kI.A1Z(str, 1));
        }
    }

    public static void a(String str, String str2) {
        Class b2 = b(str);
        if (b2 == null) {
            try {
                b.put(str, Class.forName(str2));
            } catch (ClassNotFoundException unused) {
                throw C90514aH.A0s("c14n class not found");
            }
        } else {
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(str, b2, A0M);
            throw new AlgorithmAlreadyRegisteredException("algorithm.alreadyRegistered", A0M);
        }
    }

    public void a(OutputStream outputStream) {
        ((CanonicalizerBase) this.c).n = outputStream;
    }
}
