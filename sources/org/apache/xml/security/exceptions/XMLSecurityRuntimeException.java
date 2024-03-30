package org.apache.xml.security.exceptions;

import X.AnonymousClass000;
import X.C165577te;
import X.C165597tg;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.MessageFormat;
import org.apache.xml.security.utils.I18n;

public class XMLSecurityRuntimeException extends RuntimeException {
    public Exception a;
    public String b;

    public XMLSecurityRuntimeException() {
        super("Missing message string");
        this.b = null;
        this.a = null;
    }

    public XMLSecurityRuntimeException(String str, Exception exc) {
        super(I18n.a(str, exc));
        this.b = str;
        this.a = exc;
    }

    public XMLSecurityRuntimeException(String str, Object[] objArr, Exception exc) {
        super(MessageFormat.format(I18n.b(str), objArr));
        this.b = str;
        this.a = exc;
    }

    public void printStackTrace() {
        PrintStream printStream = System.err;
        synchronized (printStream) {
            super.printStackTrace(printStream);
            Exception exc = this.a;
            if (exc != null) {
                exc.printStackTrace(printStream);
            }
        }
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printWriter);
        }
    }

    public String toString() {
        String A0k = AnonymousClass000.A0k(this);
        String localizedMessage = super.getLocalizedMessage();
        if (localizedMessage != null) {
            A0k = C165577te.A0l(": ", localizedMessage, C165597tg.A0p(A0k));
        }
        if (this.a == null) {
            return A0k;
        }
        StringBuffer A0p = C165597tg.A0p(A0k);
        A0p.append("\nOriginal Exception was ");
        return C165597tg.A0n(this.a.toString(), A0p);
    }
}
