package X;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1l9  reason: invalid class name and case insensitive filesystem */
public class C36691l9 extends AbstractCursor {
    public static final String[] A06 = C56552wT.A00;
    public int A00 = -1;
    public Cursor A01;
    public boolean A02 = false;
    public final C20810yC A03;
    public final AnonymousClass11F A04;
    public final AnonymousClass1A1 A05;

    public double getDouble(int i) {
        return 0.0d;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        if (i != 5) {
            return 0;
        }
        AnonymousClass2bU A022 = A02();
        C18740tg.A06(A022);
        return A022.A1I;
    }

    public short getShort(int i) {
        if (i != 5) {
            return 0;
        }
        Log.e("MediaCursor: Try to access media type with short type");
        return 0;
    }

    public int getType(int i) {
        return (i == 0 || i == 2 || i == 5 || i == 6) ? 1 : 3;
    }

    public boolean isNull(int i) {
        return false;
    }

    private boolean A00() {
        AnonymousClass2bU A022;
        C65013Qj r1;
        C20810yC r0;
        File file;
        if (!(this.A01.isClosed() || (A022 = A02()) == null || (r1 = A022.A01) == null)) {
            if ((A022.A1J.A02 || r1.A0V) && (file = r1.A0I) != null) {
                Uri fromFile = Uri.fromFile(file);
                if (!(fromFile == null || fromFile.getPath() == null)) {
                    return C36381kD.A1V(fromFile);
                }
            } else if (!this.A02 || !(A022 instanceof C181798o3) || (r0 = this.A03) == null || !C65703Td.A02(r0, (C46932bu) A022)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass2bU A02() {
        AnonymousClass3T1 A012;
        Cursor cursor = this.A01;
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        AnonymousClass11F r1 = this.A04;
        AnonymousClass1A1 r0 = this.A05;
        if (r1 == null) {
            A012 = r0.A00(cursor);
        } else {
            A012 = r0.A01(cursor, r1);
        }
        return (AnonymousClass2bU) A012;
    }

    public int getCount() {
        int i = this.A00;
        if (i < 0) {
            return this.A01.getCount();
        }
        return i;
    }

    public long getLong(int i) {
        if (i == 0) {
            return C36351kA.A07(this.A01, "_id");
        }
        if (i == 2) {
            AnonymousClass2bU A022 = A02();
            C18740tg.A06(A022);
            return A022.A0I;
        } else if (i != 6) {
            return 0;
        } else {
            AnonymousClass2bU A023 = A02();
            C18740tg.A06(A023);
            return (long) A023.A0B;
        }
    }

    public String getString(int i) {
        C65013Qj r0;
        File file;
        if (i == 0) {
            return Long.toString(C36351kA.A07(this.A01, "_id"));
        }
        if (i == 1) {
            AnonymousClass2bU A022 = A02();
            if (A022 == null || (r0 = A022.A01) == null || (file = r0.A0I) == null) {
                return "";
            }
            return file.getAbsolutePath();
        } else if (i == 2) {
            AnonymousClass2bU A023 = A02();
            if (A023 != null) {
                return Long.toString(A023.A0I);
            }
            return "";
        } else if (i == 3) {
            AnonymousClass2bU A024 = A02();
            C18740tg.A06(A024);
            return A024.A1a();
        } else if (i != 4) {
            return "";
        } else {
            AnonymousClass2bU A025 = A02();
            C18740tg.A06(A025);
            int i2 = A025.A1I;
            if (i2 == 1) {
                return "image/*";
            }
            if (i2 == 2) {
                return "audio/*";
            }
            if (i2 == 3) {
                return "video/*";
            }
            if (i2 != 9) {
                if (i2 == 13) {
                    return "image/gif";
                }
                if (i2 == 23 || i2 == 37 || i2 == 25) {
                    return "image/*";
                }
                if (i2 != 26) {
                    if (i2 == 28) {
                        return "video/*";
                    }
                    if (i2 != 29) {
                        return "";
                    }
                    return "image/gif";
                }
            }
            return A025.A05;
        }
    }

    public boolean onMove(int i, int i2) {
        String str;
        if (!this.A01.isClosed()) {
            if (i > i2 * 2) {
                this.A01.moveToPosition(-1);
                i = -1;
            }
            while (true) {
                if (i2 > i) {
                    boolean z = false;
                    int i3 = 0;
                    while (true) {
                        if (this.A01.isClosed() || !this.A01.moveToNext()) {
                            break;
                        } else if (A00()) {
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 > 0) {
                        C36321k7.A1T("MediaCursor/moveToNextImpl/next/skip ", AnonymousClass000.A0u(), i3);
                    }
                    i++;
                    if (!z) {
                        this.A00 = i;
                        this.A01.moveToPosition(-1);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("MediaCursor/onMove/next/realcount ");
                        str = C36381kD.A10(A0u, this.A00);
                        break;
                    }
                } else {
                    while (i2 < i) {
                        boolean z2 = false;
                        int i4 = 0;
                        while (true) {
                            if (this.A01.isClosed() || !this.A01.moveToPrevious()) {
                                break;
                            } else if (A00()) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 > 0) {
                            C36321k7.A1T("MediaCursor/moveToPreviousImpl/prev/skip ", AnonymousClass000.A0u(), i4);
                        }
                        if (!z2) {
                            this.A01.moveToPosition(-1);
                            str = "MediaCursor/onMove/prev/notfound";
                        } else {
                            i--;
                        }
                    }
                    return true;
                }
            }
            Log.i(str);
            onChange(true);
        }
        return false;
    }

    public C36691l9(Cursor cursor, C20810yC r4, AnonymousClass11F r5, AnonymousClass1A1 r6) {
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = cursor;
        this.A04 = r5;
        if (r4 != null) {
            this.A02 = !AnonymousClass6YG.A0C(r4.A09(2917));
        }
        moveToPosition(0);
    }

    @Deprecated
    public AnonymousClass2bU A01() {
        return A02();
    }

    public void close() {
        super.close();
        this.A01.close();
    }

    public String[] getColumnNames() {
        return A06;
    }
}
