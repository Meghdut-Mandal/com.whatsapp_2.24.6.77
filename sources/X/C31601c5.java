package X;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.1c5  reason: invalid class name and case insensitive filesystem */
public class C31601c5 implements XmlSerializer {
    public static final String[] A0B = {"&#0;", "&#1;", "&#2;", "&#3;", "&#4;", "&#5;", "&#6;", "&#7;", "&#8;", "&#9;", "&#10;", "&#11;", "&#12;", "&#13;", "&#14;", "&#15;", "&#16;", "&#17;", "&#18;", "&#19;", "&#20;", "&#21;", "&#22;", "&#23;", "&#24;", "&#25;", "&#26;", "&#27;", "&#28;", "&#29;", "&#30;", "&#31;", null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public OutputStream A00;
    public ByteBuffer A01;
    public int A02;
    public int A03;
    public Writer A04;
    public CharsetEncoder A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final char[] A0A;

    private void A00(char c) {
        int i = this.A03;
        if (i >= this.A09 - 1) {
            flush();
            i = this.A03;
        }
        this.A0A[i] = c;
        this.A03 = i + 1;
    }

    private void A03(String str, int i, int i2) {
        int i3 = this.A09;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i3;
                int i6 = i + i3;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                A03(str, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.A03;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.A03;
        }
        str.getChars(i, i + i2, this.A0A, i7);
        this.A03 = i7 + i2;
    }

    private void A04(char[] cArr, int i, int i2) {
        int i3 = this.A09;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i3;
                int i6 = i + i3;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                A04(cArr, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.A03;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.A03;
        }
        System.arraycopy(cArr, i, this.A0A, i7, i2);
        this.A03 = i7 + i2;
    }

    public XmlSerializer attribute(String str, String str2, String str3) {
        A00(' ');
        if (str != null) {
            A01(str);
            A00(':');
        }
        A01(str2);
        A01("=\"");
        A02(str3);
        A00('\"');
        this.A08 = false;
        return this;
    }

    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    public XmlSerializer endTag(String str, String str2) {
        String str3;
        int i = this.A02 - 1;
        this.A02 = i;
        if (this.A06) {
            str3 = " />\n";
        } else {
            if (this.A07 && this.A08) {
                int i2 = i * 4;
                int length = "                                                              ".length();
                if (i2 > length) {
                    i2 = length;
                }
                A03("                                                              ", 0, i2);
            }
            A01("</");
            if (str != null) {
                A01(str);
                A00(':');
            }
            A01(str2);
            str3 = ">\n";
        }
        A01(str3);
        this.A08 = true;
        this.A06 = false;
        return this;
    }

    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    public void flush() {
        int i = this.A03;
        if (i > 0) {
            if (this.A00 != null) {
                CharBuffer wrap = CharBuffer.wrap(this.A0A, 0, i);
                CharsetEncoder charsetEncoder = this.A05;
                ByteBuffer byteBuffer = this.A01;
                while (true) {
                    CoderResult encode = charsetEncoder.encode(wrap, byteBuffer, true);
                    if (!encode.isError()) {
                        boolean isOverflow = encode.isOverflow();
                        int position = byteBuffer.position();
                        if (isOverflow) {
                            if (position > 0) {
                                byteBuffer.flip();
                                this.A00.write(byteBuffer.array(), 0, position);
                                byteBuffer.clear();
                            }
                            charsetEncoder = this.A05;
                        } else {
                            if (position > 0) {
                                byteBuffer.flip();
                                this.A00.write(byteBuffer.array(), 0, position);
                                byteBuffer.clear();
                            }
                            this.A00.flush();
                        }
                    } else {
                        throw new IOException(encode.toString());
                    }
                }
            } else {
                this.A04.write(this.A0A, 0, i);
                this.A04.flush();
            }
            this.A03 = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.A07 = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sb.append(str2);
        sb.append("' ?>\n");
        A01(sb.toString());
        this.A08 = true;
    }

    public XmlSerializer startTag(String str, String str2) {
        if (this.A06) {
            A01(">\n");
        }
        if (this.A07) {
            int i = this.A02 * 4;
            int length = "                                                              ".length();
            if (i > length) {
                i = length;
            }
            A03("                                                              ", 0, i);
        }
        this.A02++;
        A00('<');
        if (str != null) {
            A01(str);
            A00(':');
        }
        A01(str2);
        this.A06 = true;
        this.A08 = false;
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) {
        String str;
        boolean z = false;
        if (this.A06) {
            A01(">");
            this.A06 = false;
        }
        String[] strArr = A0B;
        char c = (char) 64;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c2 = cArr[i];
            if (c2 < c && (str = strArr[c2]) != null) {
                if (i4 < i) {
                    A04(cArr, i4, i - i4);
                }
                i4 = i + 1;
                A01(str);
            }
            i++;
        }
        if (i4 < i) {
            A04(cArr, i4, i - i4);
        }
        if (this.A07) {
            if (cArr[i3 - 1] == 10) {
                z = true;
            }
            this.A08 = z;
        }
        return this;
    }

    public C31601c5(int i) {
        this.A07 = false;
        this.A02 = 0;
        this.A08 = true;
        i = i <= 0 ? 32768 : i;
        this.A09 = i;
        this.A0A = new char[i];
        this.A01 = ByteBuffer.allocate(i);
    }

    private void A01(String str) {
        A03(str, 0, str.length());
    }

    private void A02(String str) {
        String str2;
        int length = str.length();
        String[] strArr = A0B;
        char c = (char) 64;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < c && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    A03(str, i2, i - i2);
                }
                i2 = i + 1;
                A01(str2);
            }
            i++;
        }
        if (i2 < i) {
            A03(str, i2, i - i2);
        }
    }

    public void endDocument() {
        flush();
    }

    public void setOutput(Writer writer) {
        this.A04 = writer;
    }

    public C31601c5() {
        this(32768);
    }

    public void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                CharsetEncoder newEncoder = Charset.forName(str).newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                this.A05 = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                this.A00 = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw new UnsupportedEncodingException(str).initCause(e);
            } catch (UnsupportedCharsetException e2) {
                throw new UnsupportedEncodingException(str).initCause(e2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public XmlSerializer text(String str) {
        boolean z = false;
        if (this.A06) {
            A01(">");
            this.A06 = false;
        }
        A02(str);
        if (this.A07) {
            int length = str.length();
            if (length > 0 && str.charAt(length - 1) == 10) {
                z = true;
            }
            this.A08 = z;
        }
        return this;
    }
}
