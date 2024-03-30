package X;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: X.3ck  reason: invalid class name and case insensitive filesystem */
public final class C68963ck implements AnonymousClass4P8 {
    public final Activity A00;
    public final C225014r A01;
    public final AnonymousClass17Y A02;
    public final C88754Tx A03;
    public final C54022sH A04;
    public final C21060yb A05;
    public final AnonymousClass3T0 A06;

    private void A00(Uri uri, AnonymousClass11F r10, int i, int i2, int i3, boolean z) {
        AnonymousClass3T0 r1;
        Activity activity;
        Uri uri2;
        C62413Gb r7;
        if (uri == null) {
            r1 = this.A06;
            activity = this.A00;
            if (i == -1) {
                uri2 = null;
            } else {
                if (r1 instanceof C47232e6) {
                    C47232e6 r4 = (C47232e6) r1;
                    Drawable A042 = AnonymousClass3U7.A04(activity, r4.A01, i, i2, i3);
                    if (A042 == null) {
                        r7 = r4.A0B(activity, r10);
                    } else {
                        r7 = C47232e6.A01(activity, C47232e6.A02(activity, (BitmapDrawable) A042, r10, r4), AnonymousClass000.A1W(r10));
                    }
                } else {
                    AnonymousClass2e5 r42 = (AnonymousClass2e5) r1;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("wallpaper/set with resId with size (width x height): ");
                    A0u.append(i2);
                    C36321k7.A1T("x", A0u, i3);
                    Drawable A043 = AnonymousClass3U7.A04(activity, r42.A04, i, i2, i3);
                    r42.A00 = A043;
                    if (A043 != null) {
                        AnonymousClass2e5.A00(activity, A043, r42);
                    }
                    r7 = new C62413Gb(r42.A00, C36381kD.A0m(), "DOWNLOADED", true);
                }
                this.A03.Bsl(r1.A08(r7));
                if (z && uri != null) {
                    AnonymousClass1GW.A0O(activity, uri);
                    return;
                }
            }
        } else {
            r1 = this.A06;
            activity = this.A00;
            uri2 = uri;
        }
        r7 = r1.A0A(activity, uri2, r10, z);
        this.A03.Bsl(r1.A08(r7));
        if (z) {
        }
    }

    public boolean BQk(Intent intent, int i, int i2) {
        AnonymousClass11F A0Z;
        FileOutputStream openFileOutput;
        String str;
        FileOutputStream openFileOutput2;
        FileOutputStream openFileOutput3;
        String str2;
        InputStream A062;
        Uri data;
        int i3;
        boolean z;
        int intExtra;
        Intent intent2 = intent;
        int i4 = i;
        int i5 = i2;
        if (i4 == 18) {
            if (i5 == -1) {
                if (!(intent == null || intent2.getData() == null)) {
                    A0Z = C36401kF.A0Z(intent2, "chat_jid");
                    data = intent2.getData();
                    i3 = 0;
                    z = true;
                }
            } else if (i2 == 0 && intent != null && (intExtra = intent2.getIntExtra("error_message_id", -1)) > 0) {
                this.A02.A0C(this.A01, intExtra);
                return true;
            }
            return true;
        }
        if (i4 == 17) {
            if (i5 == -1 && intent != null) {
                A0Z = C36401kF.A0Z(intent2, "chat_jid");
                boolean booleanExtra = intent2.getBooleanExtra("is_using_global_wallpaper", false);
                Activity activity = this.A00;
                Point A063 = AnonymousClass3T0.A06(activity);
                if (intent2.getData() != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("conversation/wallpaper/setup/src:");
                    C36321k7.A1a(A0u, intent2.getData().toString());
                    C21050ya A0O = this.A05.A0O();
                    if (intent2.getBooleanExtra("FROM_INTERNAL_DOWNLOADS_KEY", false)) {
                        data = intent2.getData();
                        i3 = 0;
                        z = false;
                    } else {
                        if (A0O == null) {
                            Log.w("conversation/wallpaper/setup cr=null");
                        } else {
                            Uri data2 = intent2.getData();
                            Objects.requireNonNull(data2);
                            Cursor A032 = A0O.A03(data2, (String[]) null, (String) null, (String[]) null, (String) null);
                            if (A032 != null) {
                                try {
                                    boolean moveToFirst = A032.moveToFirst();
                                    int columnIndex = A032.getColumnIndex("bucket_display_name");
                                    if (moveToFirst && columnIndex >= 0 && "WallPaper".equals(A032.getString(columnIndex))) {
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        try {
                                            A062 = A0O.A06(intent2.getData());
                                            BitmapFactory.decodeStream(A062, (Rect) null, options);
                                            if (options.outWidth == A063.x && options.outHeight == A063.y) {
                                                A00(intent2.getData(), A0Z, -1, 0, 0, true);
                                                if (A062 != null) {
                                                    A062.close();
                                                }
                                                A032.close();
                                                return true;
                                            } else if (A062 != null) {
                                                A062.close();
                                            }
                                        } catch (FileNotFoundException e) {
                                            Log.e((Throwable) e);
                                        } catch (IOException e2) {
                                            Log.e((Throwable) e2);
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                        }
                                    }
                                    A032.close();
                                } catch (Throwable th2) {
                                    try {
                                        A032.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                        }
                        Uri data3 = intent2.getData();
                        Uri A09 = this.A06.A09();
                        Intent className = C36431kI.A0D().setClassName(activity.getPackageName(), "com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview");
                        className.setData(data3);
                        className.putExtra("output", A09);
                        C36341k9.A0t(className, A0Z);
                        className.putExtra("is_using_global_wallpaper", booleanExtra);
                        activity.startActivityForResult(className, 18);
                        this.A03.BxR();
                    }
                } else {
                    C88754Tx r6 = this.A03;
                    r6.B2u();
                    int intExtra2 = intent2.getIntExtra("selected_res_id", 0);
                    if (intExtra2 != 0) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("conversation/wallpaper from pgk:");
                        A0u2.append(intExtra2);
                        A0u2.append(" [");
                        A0u2.append(A063.x);
                        A0u2.append(",");
                        A0u2.append(A063.y);
                        C36321k7.A1a(A0u2, "]");
                        int i6 = intExtra2;
                        A00((Uri) null, A0Z, i6, A063.x, A063.y, true);
                    } else if (intent2.hasExtra("wallpaper_color_file")) {
                        int intExtra3 = intent2.getIntExtra("wallpaper_color_file", 0);
                        boolean booleanExtra2 = intent2.getBooleanExtra("wallpaper_doodle_overlay", false);
                        AnonymousClass3T0 r8 = this.A06;
                        if (r8 instanceof C47232e6) {
                            C47232e6 r7 = (C47232e6) r8;
                            if (booleanExtra2) {
                                str2 = "COLOR_WITH_WA_OVERLAY";
                            } else {
                                str2 = "COLOR_ONLY";
                            }
                            C47232e6.A04(activity, A0Z, new AnonymousClass37Q(C36381kD.A0m(), str2, String.valueOf(intExtra3)), r7);
                        } else {
                            AnonymousClass2e5 r72 = (AnonymousClass2e5) r8;
                            r72.A00 = null;
                            try {
                                openFileOutput3 = activity.openFileOutput("wallpaper.jpg", 0);
                                openFileOutput3.write(4);
                                openFileOutput3.write(intExtra3);
                                openFileOutput3.flush();
                                openFileOutput3.close();
                            } catch (IOException e3) {
                                Log.e((Throwable) e3);
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                            r72.A00 = r72.A08(r72.A0E(activity, false));
                            r72.A00 = true;
                        }
                        r6.Bsl(r8.A08(r8.A0B(activity, A0Z)));
                    } else {
                        if (intent2.getBooleanExtra("is_reset", false)) {
                            AnonymousClass3T0 r4 = this.A06;
                            if (r4 instanceof C47232e6) {
                                C47232e6.A04(activity, A0Z, new AnonymousClass37Q(C36381kD.A0m(), "NONE", (String) null), (C47232e6) r4);
                            } else {
                                AnonymousClass2e5 r42 = (AnonymousClass2e5) r4;
                                Log.i("wallpaper/reset");
                                r42.A00 = null;
                                try {
                                    openFileOutput2 = activity.openFileOutput("wallpaper.jpg", 0);
                                    openFileOutput2.write(3);
                                    openFileOutput2.flush();
                                    openFileOutput2.close();
                                } catch (IOException e4) {
                                    Log.e((Throwable) e4);
                                } catch (Throwable th5) {
                                    th.addSuppressed(th5);
                                }
                                r42.A07.A0D();
                            }
                            r6.Bsl((Drawable) null);
                            str = "conversation/wallpaper/reset";
                        } else if (intent2.getBooleanExtra("is_default", false)) {
                            AnonymousClass3T0 r73 = this.A06;
                            if (r73 instanceof C47232e6) {
                                C47232e6.A04(activity, A0Z, C47232e6.A07, (C47232e6) r73);
                            } else {
                                AnonymousClass2e5 r82 = (AnonymousClass2e5) r73;
                                Log.i("wallpaper/default");
                                r82.A00 = null;
                                try {
                                    openFileOutput = activity.openFileOutput("wallpaper.jpg", 0);
                                    openFileOutput.write(2);
                                    openFileOutput.flush();
                                    openFileOutput.close();
                                } catch (IOException e5) {
                                    Log.e((Throwable) e5);
                                } catch (Throwable th6) {
                                    th.addSuppressed(th6);
                                }
                                r82.A00 = r82.A08(r82.A0E(activity, false));
                                r82.A07.A0D();
                            }
                            r6.Bsl(r73.A08(r73.A0B(activity, A0Z)));
                            str = "conversation/wallpaper/default";
                        } else {
                            this.A02.A06(R.string.f12nameremoved, 0);
                            C36321k7.A1J(intent2, "conversation/wallpaper/invalid_file:", AnonymousClass000.A0u());
                        }
                        Log.i(str);
                    }
                }
            }
            this.A03.BxR();
            return true;
        }
        return false;
        A00(data, A0Z, -1, i3, 0, z);
        return true;
        throw th;
        throw th;
        throw th;
        throw th;
    }

    public C68963ck(Activity activity, C225014r r2, AnonymousClass17Y r3, C88754Tx r4, C54022sH r5, C21060yb r6, AnonymousClass3T0 r7) {
        this.A00 = activity;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
