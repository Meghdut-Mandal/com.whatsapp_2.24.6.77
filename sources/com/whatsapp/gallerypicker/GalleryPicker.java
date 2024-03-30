package com.whatsapp.gallerypicker;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16L;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1RB;
import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass1V7;
import X.AnonymousClass1V9;
import X.AnonymousClass1XS;
import X.AnonymousClass26U;
import X.AnonymousClass38K;
import X.AnonymousClass3FR;
import X.AnonymousClass3HF;
import X.AnonymousClass3U9;
import X.AnonymousClass3UF;
import X.AnonymousClass3UG;
import X.AnonymousClass3UR;
import X.AnonymousClass3US;
import X.C18740tg;
import X.C18820ts;
import X.C18950u5;
import X.C19420v0;
import X.C19430v1;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C20830yE;
import X.C27731Pn;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C64813Pn;
import X.C64953Qc;
import X.C89694Xn;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class GalleryPicker extends AnonymousClass26U {
    public int A00 = 7;
    public View A01;
    public AnonymousClass16L A02;
    public AnonymousClass16D A03;
    public AnonymousClass171 A04;
    public AnonymousClass1RY A05;
    public C27731Pn A06;
    public C64953Qc A07;
    public AnonymousClass3HF A08;
    public AnonymousClass1V6 A09;
    public C20830yE A0A;
    public AnonymousClass38K A0B;
    public AnonymousClass1XS A0C;
    public AnonymousClass005 A0D;
    public AnonymousClass005 A0E;
    public AnonymousClass005 A0F;
    public AnonymousClass005 A0G;
    public long A0H;
    public BottomSheetBehavior A0I;

    public void onCreate(Bundle bundle) {
        A28(5);
        if (AnonymousClass3U9.A00) {
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            Window window = getWindow();
            window.requestFeature(13);
            window.requestFeature(12);
            window.setExitTransition(inflateTransition);
            window.setReenterTransition(inflateTransition2);
        }
        super.onCreate(bundle);
        this.A0H = SystemClock.elapsedRealtime();
        AnonymousClass3US r1 = RequestPermissionActivity.A0B;
        C20830yE r0 = this.A0A;
        if (r0 == null) {
            throw C36331k8.A0d("waPermissionsHelper");
        } else if (!r1.A0J(this, r0)) {
            finish();
        } else {
            boolean z = this instanceof GalleryPickerBottomSheetActivity;
            int i = R.layout.f9nameremoved;
            if (z) {
                i = R.layout.f9nameremoved;
            }
            setContentView(i);
            AnonymousClass11F A022 = AnonymousClass11F.A00.A02(getIntent().getStringExtra("jid"));
            Toolbar toolbar = (Toolbar) C36361kB.A0D(this, R.id.toolbar);
            setSupportActionBar(toolbar);
            Window window2 = getWindow();
            AnonymousClass00C.A08(window2);
            int i2 = 1;
            AnonymousClass1RB.A00(window2, C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved), true);
            toolbar.setVisibility(8);
            this.A00 = getIntent().getIntExtra("include_media", 7);
            String stringExtra = getIntent().getStringExtra("title");
            if (stringExtra == null) {
                AnonymousClass38K r11 = this.A0B;
                if (r11 == null) {
                    throw C36331k8.A0d("chatGalleryPickerTitleProvider");
                } else if (A022 == null) {
                    stringExtra = "";
                } else {
                    AnonymousClass141 A0D2 = r11.A01.A0D(A022);
                    String A0H2 = r11.A02.A0H(A0D2);
                    boolean A0G2 = A0D2.A0G();
                    Context context = r11.A00;
                    int i3 = R.string.f12nameremoved;
                    if (A0G2) {
                        i3 = R.string.f12nameremoved;
                    }
                    String A0w = C36351kA.A0w(context, A0H2, 1, i3);
                    AnonymousClass00C.A0B(A0w);
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTextSize(context.getResources().getDimension(R.dimen.f7nameremoved));
                    CharSequence A032 = AnonymousClass3UG.A03(context, textPaint, r11.A03, A0w);
                    if (A032 != null) {
                        stringExtra = A032.toString();
                    } else {
                        throw AnonymousClass001.A08("Based on formatMidEmojiText contract, returned value can not be null");
                    }
                }
            }
            setTitle(stringExtra);
            if (bundle == null) {
                AnonymousClass005 r02 = this.A0E;
                if (r02 != null) {
                    AnonymousClass02E r3 = (AnonymousClass02E) r02.get();
                    Bundle A072 = AnonymousClass001.A07();
                    int i4 = this.A00;
                    if (i4 != 1) {
                        i2 = 2;
                        if (i4 != 2) {
                            i2 = 4;
                            if (i4 != 4) {
                                if (i4 == 7) {
                                    A072.putInt("include", 7);
                                }
                                A072.putString("gallery_picker_title", stringExtra);
                                r3.A17(A072);
                                AnonymousClass09Y A0O = C36341k9.A0O(this);
                                A0O.A0E(r3, "gallery_picker_fragment", R.id.gallery_picker_layout);
                                A0O.A01();
                            }
                        }
                    }
                    A072.putInt("include", i2);
                    A072.putString("gallery_picker_title", stringExtra);
                    r3.A17(A072);
                    AnonymousClass09Y A0O2 = C36341k9.A0O(this);
                    A0O2.A0E(r3, "gallery_picker_fragment", R.id.gallery_picker_layout);
                    A0O2.A01();
                } else {
                    throw C36331k8.A0d("mediaPickerFragment");
                }
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
            Uri uri = (Uri) getIntent().getParcelableExtra("bucket_uri");
            if (uri != null) {
                Intent A0G3 = C36391kE.A0G(uri);
                A0G3.putExtra("include_media", this.A00);
                A0G3.putExtra("preview", getIntent().getBooleanExtra("preview", true));
                A0G3.putExtra("quoted_message_row_id", getIntent().getLongExtra("quoted_message_row_id", 0));
                A0G3.putExtra("quoted_group_jid", getIntent().getStringExtra("quoted_group_jid"));
                A0G3.putExtra("jid", getIntent().getStringExtra("jid"));
                A0G3.putExtra("max_items", getIntent().getIntExtra("max_items", this.A0D.A07(2614)));
                A0G3.putExtra("skip_max_items_new_limit", getIntent().getBooleanExtra("skip_max_items_new_limit", false));
                A0G3.putExtra("is_in_multi_select_mode_only", getIntent().getBooleanExtra("is_in_multi_select_mode_only", false));
                A0G3.putExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
                A0G3.putExtra("picker_open_time", getIntent().getLongExtra("picker_open_time", 0));
                A0G3.putExtra("is_send_as_document", getIntent().getBooleanExtra("is_send_as_document", false));
                A0G3.setClassName(this, "com.whatsapp.gallery.NewMediaPicker");
                startActivityForResult(A0G3, 90);
            }
            if (A022 != null && !(A022 instanceof UserJid)) {
                AnonymousClass1XS r03 = this.A0C;
                if (r03 != null) {
                    r03.A00(A022);
                } else {
                    throw C36331k8.A0d("fetchPreKey");
                }
            }
            if (z) {
                View A0G4 = C36361kB.A0G(this.A00, R.id.gallery_picker_layout);
                this.A0I = new BottomSheetBehavior();
                AnonymousClass005 r04 = this.A0D;
                if (r04 != null) {
                    ((C64813Pn) r04.get()).A02(A0G4, this.A0I, this, this.A0C);
                    C64813Pn.A00(this, getSupportActionBar());
                    return;
                }
                throw C36331k8.A0d("mediaAttachmentUtils");
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        AnonymousClass00C.A0D(menu, 0);
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        int i = this.A00;
        if (i == 2) {
            str = "image/gif";
        } else if (i != 4) {
            str = "image/*";
        } else {
            str = "video/*";
        }
        intent.setType(str);
        int i2 = 0;
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
        AnonymousClass00C.A08(queryIntentActivities);
        int size = queryIntentActivities.size();
        if (size <= 0) {
            return true;
        }
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C18740tg.A06(subMenu);
        subMenu.clear();
        subMenu.setIcon(AnonymousClass3UF.A02(this, R.drawable.vec_ic_more, R.color.f6nameremoved));
        menu.findItem(R.id.default_item).setVisible(false);
        Drawable A0H2 = C36381kD.A0H(this, R.mipmap.icon);
        ArrayList A14 = C36441kJ.A14(size);
        int i3 = Integer.MIN_VALUE;
        int intrinsicHeight = A0H2.getIntrinsicHeight();
        for (ResolveInfo loadIcon : queryIntentActivities) {
            Drawable loadIcon2 = loadIcon.loadIcon(getPackageManager());
            i3 = Math.max(loadIcon2.getIntrinsicHeight(), i3);
            A14.add(loadIcon2);
        }
        int min = Math.min(intrinsicHeight, i3);
        for (ResolveInfo next : queryIntentActivities) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                throw C36351kA.A0v();
            }
            ResolveInfo resolveInfo = next;
            Drawable A072 = AnonymousClass3UF.A07(getResources(), (Drawable) A14.get(i2), min);
            AnonymousClass00C.A08(A072);
            MenuItem add = subMenu.add(resolveInfo.loadLabel(getPackageManager()));
            add.setIcon(A072);
            add.setOnMenuItemClickListener(new C89694Xn(intent, resolveInfo, this, 2));
            i2 = i4;
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AnonymousClass00C.A0D(keyEvent, 1);
        return super.onKeyDown(i, keyEvent);
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A02;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 36) {
            if (i != 90) {
                if (i != 91) {
                    super.onActivityResult(i, i2, intent);
                    return;
                } else if (i2 != -1) {
                    return;
                } else {
                    if (getIntent().getBooleanExtra("preview", true)) {
                        if (intent != null) {
                            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                            if (parcelableArrayListExtra == null) {
                                if (intent.getData() != null) {
                                    parcelableArrayListExtra = AnonymousClass001.A0I();
                                } else {
                                    return;
                                }
                            }
                            AnonymousClass3FR r6 = new AnonymousClass3FR(this);
                            r6.A0H = parcelableArrayListExtra;
                            r6.A0D = C36341k9.A0d(this);
                            r6.A02 = 1;
                            r6.A05 = SystemClock.elapsedRealtime() - this.A0H;
                            r6.A06 = getIntent().getLongExtra("picker_open_time", 0);
                            r6.A0N = true;
                            r6.A07 = getIntent().getLongExtra("quoted_message_row_id", 0);
                            r6.A0E = getIntent().getStringExtra("quoted_group_jid");
                            r6.A0K = getIntent().getBooleanExtra("number_from_url", false);
                            startActivityForResult(r6.A01(), 90);
                            return;
                        }
                        return;
                    }
                }
            } else if (i2 != -1) {
                if (i2 == 2) {
                    setResult(2);
                    finish();
                }
                return;
            }
        } else if (i2 != -1) {
            return;
        }
        setResult(-1, intent);
        finish();
    }

    public void onBackPressed() {
        AnonymousClass005 r0 = this.A0F;
        if (r0 != null) {
            r0.get();
            super.onBackPressed();
            return;
        }
        throw C36331k8.A0d("outOfChatDisplayControllerLazy");
    }

    public void onResume() {
        super.onResume();
        AnonymousClass005 r0 = this.A0F;
        if (r0 != null) {
            boolean z = C36431kI.A0o(r0).A03;
            View view = this.A00;
            if (z) {
                C20810yC r15 = this.A0D;
                AnonymousClass17Y r13 = this.A05;
                C19730wQ r12 = this.A02;
                C19770wU r11 = this.A04;
                C27731Pn r10 = this.A06;
                if (r10 != null) {
                    AnonymousClass16D r9 = this.A03;
                    if (r9 != null) {
                        AnonymousClass171 r8 = this.A04;
                        if (r8 != null) {
                            C18820ts r7 = this.A00;
                            AnonymousClass3HF r6 = this.A08;
                            if (r6 != null) {
                                AnonymousClass1V6 r5 = this.A09;
                                if (r5 != null) {
                                    AnonymousClass005 r4 = this.A0F;
                                    if (r4 != null) {
                                        AnonymousClass005 r3 = this.A0G;
                                        if (r3 != null) {
                                            View view2 = this.A01;
                                            AnonymousClass1RY r1 = this.A05;
                                            C19420v0 r25 = this.A09;
                                            AnonymousClass1V6 r24 = r5;
                                            AnonymousClass3HF r23 = r6;
                                            C27731Pn r22 = r10;
                                            AnonymousClass1RY r21 = r1;
                                            AnonymousClass171 r20 = r8;
                                            AnonymousClass16D r19 = r9;
                                            C19730wQ r18 = r12;
                                            AnonymousClass17Y r17 = r13;
                                            View view3 = view2;
                                            View view4 = view;
                                            Pair A002 = AnonymousClass3UR.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "gallery-picker-activity");
                                            this.A01 = (View) A002.first;
                                            this.A05 = (AnonymousClass1RY) A002.second;
                                        } else {
                                            throw C36331k8.A0d("sequentialMessageControllerLazy");
                                        }
                                    } else {
                                        throw C36331k8.A0d("outOfChatDisplayControllerLazy");
                                    }
                                } else {
                                    throw C36331k8.A0d("messageAudioPlayerProvider");
                                }
                            } else {
                                throw C36331k8.A0d("messageAudioPlayerFactory");
                            }
                        } else {
                            throw C36331k8.A0c();
                        }
                    } else {
                        throw C36331k8.A0Z();
                    }
                } else {
                    throw C36331k8.A0d("contactPhotos");
                }
            } else if (AnonymousClass1V9.A00(view)) {
                AnonymousClass1V6 r2 = this.A09;
                if (r2 != null) {
                    AnonymousClass005 r14 = this.A0F;
                    if (r14 != null) {
                        AnonymousClass3UR.A04(this.A00, r2, r14);
                    } else {
                        throw C36331k8.A0d("outOfChatDisplayControllerLazy");
                    }
                } else {
                    throw C36331k8.A0d("messageAudioPlayerProvider");
                }
            }
            AnonymousClass005 r02 = this.A0F;
            if (r02 != null) {
                C36421kH.A1I(r02);
                return;
            }
            throw C36331k8.A0d("outOfChatDisplayControllerLazy");
        }
        throw C36331k8.A0d("outOfChatDisplayControllerLazy");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass16L r0 = this.A02;
        if (r0 != null) {
            r0.A02().A02.A07(-1);
            AnonymousClass1V6 r1 = this.A09;
            if (r1 != null) {
                AnonymousClass3UR.A02(this.A01, r1);
                AnonymousClass1RY r02 = this.A05;
                if (r02 != null) {
                    r02.A02();
                }
                this.A05 = null;
                C64953Qc r12 = this.A07;
                if (r12 != null) {
                    r12.A02(5);
                    AnonymousClass3U9.A07(this);
                    return;
                }
                throw C36331k8.A0d("conversationAttachmentEventLogger");
            }
            throw C36331k8.A0d("messageAudioPlayerProvider");
        }
        throw C36331k8.A0d("caches");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        AnonymousClass1V6 r0 = this.A09;
        if (r0 != null) {
            AnonymousClass3UR.A07(r0);
            AnonymousClass005 r02 = this.A0F;
            if (r02 != null) {
                AnonymousClass1V7 A0o = C36431kI.A0o(r02);
                View view = this.A00;
                AnonymousClass00C.A08(view);
                A0o.A01(view);
                return;
            }
            throw C36331k8.A0d("outOfChatDisplayControllerLazy");
        }
        throw C36331k8.A0d("messageAudioPlayerProvider");
    }

    public void onStart() {
        super.onStart();
        if (this.A0I != null && (this instanceof GalleryPickerBottomSheetActivity)) {
            AnonymousClass005 r0 = this.A0D;
            if (r0 != null) {
                ((C64813Pn) r0.get()).A03(this.A0I, this);
                return;
            }
            throw C36331k8.A0d("mediaAttachmentUtils");
        }
    }
}
