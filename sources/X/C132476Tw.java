package X;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6Tw  reason: invalid class name and case insensitive filesystem */
public abstract class C132476Tw {
    public static C132476Tw A00(C19630wG r7, C20810yC r8, AnonymousClass6KH r9, File file, int i) {
        boolean z;
        C20810yC r3 = r8;
        if (r8 != null) {
            z = A01(r8);
        } else {
            z = false;
        }
        File file2 = file;
        int i2 = i;
        if (r7 != null && z && file.getAbsolutePath().endsWith(".opus")) {
            return new AnonymousClass5LW(r7.A00, r3, r9, file2, i2);
        }
        if (!file.getAbsolutePath().endsWith(".opus")) {
            AnonymousClass5LV r2 = new AnonymousClass5LV((Looper) null, i);
            r2.A01.setDataSource(file.getAbsolutePath());
            return r2;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioPlayer/create exoplayer enabled:");
        A0u.append(z);
        A0u.append(" Build.MANUFACTURER:");
        A0u.append(Build.MANUFACTURER);
        A0u.append(" Build.DEVICE:");
        A0u.append(Build.DEVICE);
        A0u.append(" SDK_INT:");
        C36351kA.A1R(A0u, Build.VERSION.SDK_INT);
        return new AnonymousClass5LU(file, i);
    }

    public static boolean A01(C20810yC r3) {
        if (!r3.A0E(751) || AnonymousClass6YG.A0C(r3.A09(2917)) || AnonymousClass6YG.A0D(r3.A09(5589))) {
            return false;
        }
        return true;
    }

    public int A02() {
        if (this instanceof AnonymousClass5LU) {
            try {
                return (int) ((AnonymousClass5LU) this).A01.getCurrentPosition();
            } catch (IOException e) {
                Log.e((Throwable) e);
                return 0;
            }
        } else if (this instanceof AnonymousClass5LW) {
            return (int) ((AnonymousClass5LW) this).A07.A08();
        } else {
            return ((AnonymousClass5LV) this).A01.getCurrentPosition();
        }
    }

    public int A03() {
        if (this instanceof AnonymousClass5LU) {
            try {
                return (int) ((AnonymousClass5LU) this).A01.getLength();
            } catch (IOException e) {
                Log.e((Throwable) e);
                return 0;
            }
        } else if (this instanceof AnonymousClass5LW) {
            return ((AnonymousClass5LW) this).A00;
        } else {
            return ((AnonymousClass5LV) this).A01.getDuration();
        }
    }

    public void A04() {
        if (this instanceof AnonymousClass5LU) {
            try {
                ((AnonymousClass5LU) this).A01.pause();
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
        } else if (this instanceof AnonymousClass5LW) {
            AnonymousClass5LW r1 = (AnonymousClass5LW) this;
            r1.A06 = false;
            r1.A07.A0B();
        } else {
            ((AnonymousClass5LV) this).A01.pause();
        }
    }

    public void A05() {
        if (this instanceof AnonymousClass5LU) {
            ((AnonymousClass5LU) this).A01.prepare();
        } else if (this instanceof AnonymousClass5LW) {
            ((AnonymousClass5LW) this).A07.A0G(1.0f);
        } else {
            ((AnonymousClass5LV) this).A01.prepare();
        }
    }

    public void A06() {
        if (this instanceof AnonymousClass5LU) {
            ((AnonymousClass5LU) this).A01.close();
        } else if (this instanceof AnonymousClass5LW) {
            AnonymousClass5LW r1 = (AnonymousClass5LW) this;
            r1.A02 = null;
            r1.A05 = false;
            r1.A06 = false;
            r1.A07.A0D();
        } else {
            AnonymousClass5LV r12 = (AnonymousClass5LV) this;
            r12.A02.postDelayed(new C81183wb(r12, 46), 100);
        }
    }

    public void A07() {
        if (this instanceof AnonymousClass5LU) {
            ((AnonymousClass5LU) this).A01.resume();
        } else if (this instanceof AnonymousClass5LW) {
            ((AnonymousClass5LW) this).A07.A0C();
        } else {
            ((AnonymousClass5LV) this).A01.start();
        }
    }

    public void A08() {
        if (this instanceof AnonymousClass5LU) {
            ((AnonymousClass5LU) this).A01.start();
        } else if (this instanceof AnonymousClass5LW) {
            AnonymousClass5LW r1 = (AnonymousClass5LW) this;
            r1.A06 = true;
            r1.A07.A0C();
        } else {
            ((AnonymousClass5LV) this).A01.start();
        }
    }

    public void A09() {
        C158577hj r0;
        if (this instanceof AnonymousClass5LU) {
            AnonymousClass5LU r1 = (AnonymousClass5LU) this;
            try {
                r1.A01.stop();
                C158577hj r02 = r1.A00;
                if (r02 != null) {
                    r02.Bho();
                }
            } catch (IOException e) {
                Log.e((Throwable) e);
            }
        } else {
            if (this instanceof AnonymousClass5LW) {
                AnonymousClass5LW r12 = (AnonymousClass5LW) this;
                r12.A06 = false;
                r12.A07.A0F();
                r0 = r12.A03;
            } else {
                AnonymousClass5LV r13 = (AnonymousClass5LV) this;
                r13.A01.stop();
                r0 = r13.A00;
            }
            if (r0 != null) {
                r0.Bho();
            }
        }
    }

    public void A0A(int i) {
        if (this instanceof AnonymousClass5LU) {
            ((AnonymousClass5LU) this).A01.seek((long) i);
        } else if (this instanceof AnonymousClass5LW) {
            C204359ps r2 = ((AnonymousClass5LW) this).A07;
            C114905i1 r1 = new C114905i1();
            r1.A00 = i;
            r2.A0J(new AnonymousClass60G(r1));
        } else {
            ((AnonymousClass5LV) this).A01.seekTo(i);
        }
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
        if (!(this instanceof AnonymousClass5LU) && !(this instanceof AnonymousClass5LW)) {
            ((AnonymousClass5LV) this).A01.setOnErrorListener(onErrorListener);
        }
    }

    public void A0C(C158577hj r2) {
        if (this instanceof AnonymousClass5LU) {
            ((AnonymousClass5LU) this).A00 = r2;
        } else if (this instanceof AnonymousClass5LW) {
            ((AnonymousClass5LW) this).A03 = r2;
        } else {
            ((AnonymousClass5LV) this).A00 = r2;
        }
    }

    public boolean A0D() {
        if (this instanceof AnonymousClass5LU) {
            try {
                return ((AnonymousClass5LU) this).A01.isPlaying();
            } catch (IOException e) {
                Log.e((Throwable) e);
                return false;
            }
        } else if (!(this instanceof AnonymousClass5LW)) {
            return ((AnonymousClass5LV) this).A01.isPlaying();
        } else {
            AnonymousClass5LW r0 = (AnonymousClass5LW) this;
            C204359ps r2 = r0.A07;
            if (r2 == null) {
                return false;
            }
            if (r0.A06 || r2.A0M()) {
                return true;
            }
            return false;
        }
    }

    public boolean A0E(C19700wN r6, float f) {
        if (this instanceof AnonymousClass5LU) {
            return false;
        }
        AnonymousClass5LW r0 = (AnonymousClass5LW) this;
        r0.A01 = r6;
        try {
            C204359ps r2 = r0.A07;
            if (C90494aF.A01(r2.A0L, f) < 0.1f) {
                return true;
            }
            C204359ps.A06(r2, "setPlaybackSpeed", C90524aI.A0w());
            AnonymousClass000.A14(r2.A0C, Float.valueOf(f), 26);
            return true;
        } catch (IllegalArgumentException | IllegalStateException unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("currSpeed: ");
            A0u.append(-1.0f);
            r6.A0E("heroaudioplayer/setPlaybackSpeed failed", C90484aE.A0o(" , newSpeed: ", A0u, f), true);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("heroaudioplayer/setPlaybackSpeed failed, currSpeed: ");
            A0u2.append(-1.0f);
            Log.e(C90484aE.A0o(" , newSpeed: ", A0u2, f));
            return false;
        }
    }
}
