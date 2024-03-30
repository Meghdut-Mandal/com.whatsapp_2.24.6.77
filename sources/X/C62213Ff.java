package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;

/* renamed from: X.3Ff  reason: invalid class name and case insensitive filesystem */
public class C62213Ff {
    public final AnonymousClass12P A00;

    public void A00(AnonymousClass3QP r9, long j) {
        AnonymousClass1M0 A05;
        Integer num;
        Integer num2;
        try {
            A05 = this.A00.A05();
            int i = r9.A02;
            int i2 = r9.A01;
            int i3 = r9.A03;
            ContentValues A0E = C36441kJ.A0E();
            C36341k9.A0p(A0E, "message_row_id", j);
            A0E.put("waveform", r9.A05);
            C36341k9.A0o(A0E, "background_color", r9.A00);
            Integer num3 = null;
            if (i == 0) {
                num = null;
            } else {
                num = Integer.valueOf(i);
            }
            A0E.put("transcription_status", num);
            if (i2 == 0) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(i2);
            }
            A0E.put("transcription_locale", num2);
            if (i3 != 0) {
                num3 = Integer.valueOf(i3);
            }
            A0E.put("transcription_confidence_threshold", num3);
            A05.A02.A08("audio_data", "INSERT_AUDIO_DATA_SQL", A0E, 5);
            A05.close();
            return;
        } catch (SQLiteConstraintException e) {
            Log.e("WaveformMessageStore/insertWaveform/", e);
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A01(C46812bi r11) {
        Cursor A09;
        AnonymousClass3QP r4;
        long j = r11.A1N;
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            C224114e r6 = A04.A02;
            String[] A1R = C36441kJ.A1R();
            C36421kH.A1Q(A1R, j);
            A09 = r6.A09("\n          SELECT\n            message_row_id,\n            waveform,\n            background_color,\n            transcription_status,\n            transcription_locale,\n            transcription_confidence_threshold\n          FROM audio_data\n          WHERE message_row_id = ?\n        ", "GET_AUDIO_DATA_SQL", A1R);
            if (A09.moveToLast()) {
                byte[] A1b = C36391kE.A1b(A09, "waveform");
                int A03 = C36351kA.A03(A09, "background_color");
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("transcription_status");
                int i = 0;
                if (!A09.isNull(columnIndexOrThrow)) {
                    i = A09.getInt(columnIndexOrThrow);
                }
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("transcription_locale");
                int i2 = 0;
                if (!A09.isNull(columnIndexOrThrow2)) {
                    i2 = A09.getInt(columnIndexOrThrow2);
                }
                int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("transcription_confidence_threshold");
                int i3 = 0;
                if (!A09.isNull(columnIndexOrThrow3)) {
                    i3 = A09.getInt(columnIndexOrThrow3);
                }
                r4 = new AnonymousClass3QP(A1b, A03, i, i2, i3);
                A09.close();
                A04.close();
            } else {
                A09.close();
                A04.close();
                r4 = null;
            }
            r11.A1j(r4);
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C62213Ff(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
