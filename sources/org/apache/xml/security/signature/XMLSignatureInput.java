package org.apache.xml.security.signature;

import X.AnonymousClass000;
import X.C165577te;
import X.C165597tg;
import X.C165607th;
import X.C36441kJ;
import X.C90514aH;
import X.C90524aI;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.implementations.Canonicalizer11_OmitComments;
import org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments;
import org.apache.xml.security.c14n.implementations.CanonicalizerBase;
import org.apache.xml.security.exceptions.XMLSecurityRuntimeException;
import org.apache.xml.security.utils.IgnoreAllErrorHandler;
import org.apache.xml.security.utils.JavaUtils;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XMLSignatureInput implements Cloneable {
    public static Log a;
    public static Class l;
    public InputStream b;
    public Set c;
    public Node d;
    public Node e;
    public boolean f;
    public boolean g;
    public byte[] h;
    public List i;
    public boolean j;
    public OutputStream k;
    public String m;
    public String n;

    static {
        Class c2 = c("org.apache.xml.security.signature.XMLSignatureInput");
        l = c2;
        a = LogFactory.getLog(c2.getName());
    }

    public void a(OutputStream outputStream) {
        a(outputStream, false);
    }

    public void a(String str) {
        this.m = str;
    }

    public void a(NodeFilter nodeFilter) {
        if (h()) {
            try {
                q();
            } catch (Exception e2) {
                throw new XMLSecurityRuntimeException("signature.XMLSignatureInput.nodesetReference", e2);
            }
        }
        this.i.add(nodeFilter);
    }

    public void a(Node node) {
        this.e = node;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public boolean a() {
        return this.j;
    }

    public Set b() {
        return b(false);
    }

    public void b(OutputStream outputStream) {
        this.k = outputStream;
    }

    public void b(String str) {
        this.n = str;
    }

    public InputStream c() {
        InputStream inputStream = this.b;
        return !(inputStream instanceof FileInputStream) ? o() : inputStream;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public InputStream d() {
        return this.b;
    }

    public void d(boolean z) {
        this.g = z;
    }

    public byte[] e() {
        byte[] bArr = this.h;
        if (bArr == null) {
            InputStream o = o();
            if (o != null) {
                bArr = this.h;
                if (bArr == null) {
                    o.reset();
                    bArr = JavaUtils.a(o);
                }
            } else {
                bArr = new Canonicalizer20010315OmitComments().b(this);
            }
            this.h = bArr;
        }
        return bArr;
    }

    public boolean f() {
        return (this.b == null && this.c != null) || this.g;
    }

    public boolean g() {
        return this.b == null && this.d != null && this.c == null && !this.g;
    }

    public boolean h() {
        return !(this.b == null && this.h == null) && this.c == null && this.d == null;
    }

    public boolean j() {
        return this.h != null && this.c == null && this.d == null;
    }

    public String k() {
        return this.n;
    }

    public Node l() {
        return this.e;
    }

    public Node m() {
        return this.d;
    }

    public boolean n() {
        return this.f;
    }

    public List p() {
        return this.i;
    }

    public void a(OutputStream outputStream, boolean z) {
        CanonicalizerBase canonicalizer20010315OmitComments;
        if (outputStream != this.k) {
            byte[] bArr = this.h;
            if (bArr != null) {
                outputStream.write(bArr);
                return;
            }
            InputStream inputStream = this.b;
            if (inputStream == null) {
                if (z) {
                    canonicalizer20010315OmitComments = new Canonicalizer11_OmitComments();
                } else {
                    canonicalizer20010315OmitComments = new Canonicalizer20010315OmitComments();
                }
                canonicalizer20010315OmitComments.n = outputStream;
                canonicalizer20010315OmitComments.b(this);
            } else if (inputStream instanceof FileInputStream) {
                byte[] bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                while (true) {
                    int read = this.b.read(bArr2);
                    if (read != -1) {
                        outputStream.write(bArr2, 0, read);
                    } else {
                        return;
                    }
                }
            } else {
                InputStream o = o();
                byte[] bArr3 = this.h;
                if (bArr3 != null) {
                    outputStream.write(bArr3, 0, bArr3.length);
                    return;
                }
                o.reset();
                byte[] bArr4 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                while (true) {
                    int read2 = o.read(bArr4);
                    if (read2 > 0) {
                        outputStream.write(bArr4, 0, read2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Set b(boolean z) {
        Node node;
        Set set = this.c;
        if (set != null) {
            return set;
        }
        if (this.b == null && (node = this.d) != null) {
            if (z) {
                XMLUtils.a(XMLUtils.b(node));
            }
            HashSet A16 = C36441kJ.A16();
            this.c = A16;
            XMLUtils.a(this.d, (Set) A16, this.e, this.f);
            return this.c;
        } else if (h()) {
            q();
            HashSet A162 = C36441kJ.A16();
            XMLUtils.b(this.d, A162, (Node) null, false);
            return A162;
        } else {
            throw C90514aH.A0s("getNodeSet() called but no input data present");
        }
    }

    public boolean i() {
        return AnonymousClass000.A1V(this.k);
    }

    public InputStream o() {
        InputStream inputStream = this.b;
        if (!(inputStream instanceof ByteArrayInputStream)) {
            byte[] bArr = this.h;
            if (bArr == null) {
                if (inputStream == null) {
                    return null;
                }
                if (inputStream.markSupported()) {
                    a.info("Mark Suported but not used as reset");
                }
                this.h = JavaUtils.a(this.b);
                this.b.close();
                bArr = this.h;
            }
            ByteArrayInputStream A0P = C90524aI.A0P(bArr);
            this.b = A0P;
            return A0P;
        } else if (inputStream.markSupported()) {
            return this.b;
        } else {
            StringBuffer A0x = C165607th.A0x();
            A0x.append("Accepted as Markable but not truly been");
            A0x.append(this.b);
            throw C90514aH.A0s(A0x.toString());
        }
    }

    public String toString() {
        StringBuffer A0x;
        String str;
        if (f()) {
            A0x = C165607th.A0x();
            A0x.append("XMLSignatureInput/NodeSet/");
            A0x.append(this.c.size());
            str = " nodes/";
        } else if (g()) {
            A0x = C165607th.A0x();
            A0x.append("XMLSignatureInput/Element/");
            A0x.append(this.d);
            A0x.append(" exclude ");
            A0x.append(this.e);
            A0x.append(" comments:");
            A0x.append(this.f);
            str = "/";
        } else {
            try {
                StringBuffer A0x2 = C165607th.A0x();
                A0x2.append("XMLSignatureInput/OctetStream/");
                A0x2.append(e().length);
                A0x2.append(" octets/");
                A0x2.append(this.n);
                return A0x2.toString();
            } catch (IOException | CanonicalizationException unused) {
                return C165597tg.A0n(this.n, C165597tg.A0p("XMLSignatureInput/OctetStream//"));
            }
        }
        A0x.append(str);
        return C165597tg.A0n(this.n, A0x);
    }

    public XMLSignatureInput(InputStream inputStream) {
        C165577te.A1R(this);
        this.b = inputStream;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw C165577te.A0m(e2);
        }
    }

    public void q() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        newInstance.setNamespaceAware(true);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        try {
            newDocumentBuilder.setErrorHandler(new IgnoreAllErrorHandler());
            this.d = newDocumentBuilder.parse(c());
        } catch (SAXException unused) {
            ByteArrayOutputStream A0Q = C90524aI.A0Q();
            A0Q.write("<container>".getBytes());
            A0Q.write(e());
            A0Q.write("</container>".getBytes());
            this.d = newDocumentBuilder.parse(C90524aI.A0P(A0Q.toByteArray())).getDocumentElement().getFirstChild().getFirstChild();
        }
        this.b = null;
        this.h = null;
    }

    public XMLSignatureInput(Node node) {
        C165577te.A1R(this);
        this.d = node;
    }

    public XMLSignatureInput(byte[] bArr) {
        C165577te.A1R(this);
        this.h = bArr;
    }
}
