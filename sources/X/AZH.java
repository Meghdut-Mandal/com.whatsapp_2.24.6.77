package X;

import java.io.IOException;

public class AZH implements B0F {
    public void B6q(Appendable appendable, String str) {
        try {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 12) {
                    appendable.append("\\f");
                } else if (charAt == 13) {
                    appendable.append("\\r");
                } else if (charAt == '\"') {
                    appendable.append("\\\"");
                } else if (charAt == '/') {
                    appendable.append("\\/");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            appendable.append("\\b");
                            break;
                        case 9:
                            appendable.append("\\t");
                            break;
                        case 10:
                            appendable.append("\\n");
                            break;
                        default:
                            if (charAt >= 0 && (charAt <= 31 || (charAt >= 127 && (charAt <= 159 || (charAt >= 8192 && charAt <= 8447))))) {
                                appendable.append("\\u");
                                C165587tf.A1E(appendable, charAt >> 12);
                                C165587tf.A1E(appendable, charAt >> 8);
                                C165587tf.A1E(appendable, charAt >> 4);
                                C165587tf.A1E(appendable, charAt >> 0);
                                break;
                            } else {
                                appendable.append(charAt);
                                break;
                            }
                            break;
                    }
                } else {
                    appendable.append("\\\\");
                }
            }
        } catch (IOException unused) {
            throw C90514aH.A0s("Impossible Error");
        }
    }
}
