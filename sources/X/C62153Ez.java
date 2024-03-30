package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3Ez  reason: invalid class name and case insensitive filesystem */
public class C62153Ez {
    public final C220412q A00;
    public final AnonymousClass1DG A01;
    public final AnonymousClass1DF A02;
    public final AnonymousClass12P A03;
    public final C65343Rr A04;
    public final AnonymousClass1A1 A05;
    public final AnonymousClass1SV A06;

    public C62153Ez(C220412q r1, AnonymousClass1DG r2, AnonymousClass1DF r3, AnonymousClass12P r4, C65343Rr r5, AnonymousClass1A1 r6, AnonymousClass1SV r7) {
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
    }

    public AnonymousClass37U A00(C02680Bk r16, int i, int i2) {
        Cursor A022;
        r16.A04();
        try {
            AnonymousClass1M0 A042 = this.A03.get();
            try {
                int i3 = i2;
                A022 = AnonymousClass1V2.A02(this.A02, (AnonymousClass11F) null, i3, 2);
                r16.A04();
                C36691l9 r10 = new C36691l9(A022, (C20810yC) null, (AnonymousClass11F) null, this.A05);
                long j = 0;
                ArrayList A0I = AnonymousClass001.A0I();
                ArrayList A0I2 = AnonymousClass001.A0I();
                int columnIndexOrThrow = A022.getColumnIndexOrThrow("file_size");
                int i4 = 0;
                if (r10.moveToFirst()) {
                    do {
                        r16.A04();
                        AnonymousClass2bU A023 = r10.A02();
                        if (A023 == null || !this.A00.A0Q(A023.A1J.A00)) {
                            j += A022.getLong(columnIndexOrThrow);
                            if (i4 < i) {
                                AnonymousClass2bU A024 = r10.A02();
                                C18740tg.A06(A024);
                                C74833mF A002 = C63923Ly.A00(A024, this.A06);
                                A0I.add(A002);
                                C36391kE.A1W(A0I2, A002.A02.A1N);
                            }
                            i4++;
                        }
                    } while (r10.moveToNext());
                }
                int size = A0I.size();
                r10.close();
                if (i3 == 2) {
                    C65343Rr r5 = this.A04;
                    AnonymousClass199 r102 = r5.A00;
                    AnonymousClass199.A04(r102, "STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE", String.valueOf(j));
                    AnonymousClass199.A04(r102, "STORAGE_USAGE_LARGE_FILES_COUNT", String.valueOf(size));
                    AnonymousClass199.A04(r102, "STORAGE_USAGE_LARGE_FILES_ROW_IDS", TextUtils.join(",", A0I2));
                    C65343Rr.A00(r5, "STORAGE_USAGE_LARGE_FILES_CACHE_TIME");
                } else {
                    C65343Rr r52 = this.A04;
                    AnonymousClass199 r103 = r52.A00;
                    AnonymousClass199.A04(r103, "STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE", String.valueOf(j));
                    AnonymousClass199.A04(r103, "STORAGE_USAGE_FORWARDED_FILES_COUNT", String.valueOf(size));
                    AnonymousClass199.A04(r103, "STORAGE_USAGE_FORWARDED_FILES_ROW_IDS", TextUtils.join(",", A0I2));
                    C65343Rr.A00(r52, "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME");
                }
                AnonymousClass37U r0 = new AnonymousClass37U(A0I, size, j);
                A022.close();
                A042.close();
                return r0;
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (AnonymousClass02S e) {
            throw e;
        } catch (RuntimeException e2) {
            Log.e("StorageUsageDbFetcher/fetchMediaFilesSummary", e2);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
