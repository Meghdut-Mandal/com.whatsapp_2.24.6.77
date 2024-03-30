package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass155;
import X.AnonymousClass16I;
import X.AnonymousClass1RC;
import X.AnonymousClass1WR;
import X.AnonymousClass32e;
import X.AnonymousClass32f;
import X.AnonymousClass38Z;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y5;
import X.AnonymousClass4U0;
import X.AnonymousClass4W3;
import X.AnonymousClass4WM;
import X.AnonymousClass4XO;
import X.AnonymousClass4YM;
import X.AnonymousClass4ZS;
import X.C18800tq;
import X.C18830tt;
import X.C224514j;
import X.C226815j;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C37791nD;
import X.C39001qm;
import X.C64873Pt;
import X.C89354Wf;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class SetAboutInfo extends AnonymousClass155 implements AnonymousClass4U0 {
    public static ArrayList A0A;
    public View A00;
    public AnonymousClass1WR A01;
    public TextEmojiLabel A02;
    public AnonymousClass16I A03;
    public C37791nD A04;
    public C64873Pt A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final C226815j A09;

    public void BSF(String str) {
    }

    public void BT1(int i) {
        if (i == 4) {
            this.A05.A01(2);
        }
    }

    public void BWL(int i, String str) {
        if (i == 4 && str.length() > 0 && !str.equals(C36371kC.A0u(this.A02))) {
            this.A00.setOnClickListener((View.OnClickListener) null);
            A3i(str);
            this.A05.A01(1);
        }
    }

    public Dialog onCreateDialog(int i) {
        String str;
        int i2;
        if (i == 0) {
            str = getString(R.string.f12nameremoved);
            i2 = R.string.f12nameremoved;
        } else if (i == 1) {
            str = getString(R.string.f12nameremoved);
            i2 = R.string.f12nameremoved;
        } else if (i == 2) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            C36391kE.A17(progressDialog, this, R.string.f12nameremoved);
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A0c(R.string.f12nameremoved);
            C39001qm.A03(new AnonymousClass4XO(this, 6), A002, R.string.f12nameremoved);
            return A002.create();
        }
        return ProgressDialog.show(this, str, getString(i2), true, false);
    }

    public static void A01(SetAboutInfo setAboutInfo) {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(setAboutInfo.openFileOutput("status", 0));
            StringBuilder A0u = AnonymousClass000.A0u();
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                A0u.append(AnonymousClass001.A0C(it));
                A0u.append("\n");
            }
            if (A0u.length() > 1) {
                A0u.deleteCharAt(A0u.length() - 1);
            }
            objectOutputStream.writeObject(A0u.toString());
            objectOutputStream.close();
            return;
        } catch (IOException e) {
            Log.e("SetStatus/writeStatusListString", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (AnonymousClass1WR) A0B.A03.get();
            this.A05 = (C64873Pt) r1.A9Y.get();
            this.A03 = C36351kA.A0S(A0B);
        }
    }

    public SetAboutInfo(int i) {
        this.A07 = false;
        C89354Wf.A00(this, 30);
    }

    public void A3i(String str) {
        if (!A3J(R.string.f12nameremoved)) {
            AnonymousClass3SJ.A01(this, 2);
            AnonymousClass1WR r2 = this.A01;
            AnonymousClass32f r3 = new AnonymousClass32f(this);
            AnonymousClass4ZS r1 = new AnonymousClass4ZS(this, 3);
            if (!r2.A05.A0J(Message.obtain((Handler) null, 0, 29, 0, new AnonymousClass38Z(new AnonymousClass32e(this), r3, r1, str)))) {
                Handler handler = this.A08;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
            }
            this.A08.sendEmptyMessageDelayed(0, 32000);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (menuItem.getItemId() == 1) {
            A0A.remove(adapterContextMenuInfo.position);
            this.A04.notifyDataSetChanged();
            A01(this);
            this.A05.A01(4);
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void onCreate(Bundle bundle) {
        ObjectInputStream objectInputStream;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        View findViewById = findViewById(R.id.status_layout);
        this.A00 = findViewById;
        AnonymousClass3Y5.A00(findViewById, this, 36);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.status_tv);
        this.A02 = A0I;
        A0I.A0I(this.A01.A00());
        if (C36441kJ.A0w(getFilesDir(), "status").exists()) {
            try {
                objectInputStream = new ObjectInputStream(openFileInput("status"));
                ArrayList A0I2 = AnonymousClass001.A0I();
                A0A = A0I2;
                for (String str : ((String) objectInputStream.readObject()).split("\n")) {
                    if (str.length() > 0) {
                        A0I2.add(str);
                    }
                }
                objectInputStream.close();
            } catch (ClassNotFoundException e) {
                Log.w("create/status/serialization_error", e);
            } catch (IOException e2) {
                Log.e((Throwable) e2);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            AbsListView absListView = (AbsListView) findViewById(R.id.list);
            absListView.setEmptyView(findViewById(R.id.list_empty));
            C37791nD r0 = new C37791nD(this, this, A0A);
            this.A04 = r0;
            absListView.setAdapter(r0);
            absListView.setOnItemClickListener(new AnonymousClass4WM(this.A07, this, 0));
            registerForContextMenu(absListView);
            this.A03.registerObserver(this.A09);
            AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.status_tv_edit_icon), AnonymousClass1RC.A00(this, R.attr.f4nameremoved, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved)));
            return;
        }
        TypedArray obtainTypedArray = getResources().obtainTypedArray(R.array.f3nameremoved);
        try {
            ArrayList A0I3 = AnonymousClass001.A0I();
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                A0I3.add(obtainTypedArray.getString(i));
            }
            obtainTypedArray.recycle();
            A0A = A0I3;
            AbsListView absListView2 = (AbsListView) findViewById(R.id.list);
            absListView2.setEmptyView(findViewById(R.id.list_empty));
            C37791nD r02 = new C37791nD(this, this, A0A);
            this.A04 = r02;
            absListView2.setAdapter(r02);
            absListView2.setOnItemClickListener(new AnonymousClass4WM(this.A07, this, 0));
            registerForContextMenu(absListView2);
            this.A03.registerObserver(this.A09);
            AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.status_tv_edit_icon), AnonymousClass1RC.A00(this, R.attr.f4nameremoved, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved)));
            return;
        } catch (Throwable th2) {
            obtainTypedArray.recycle();
            throw th2;
        }
        throw th;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, R.string.f12nameremoved);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f12nameremoved);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.unregisterObserver(this.A09);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        } else if (A0A.size() == 0) {
            BO5(R.string.f12nameremoved);
            return true;
        } else {
            AnonymousClass3SJ.A01(this, 3);
            return true;
        }
    }

    public SetAboutInfo() {
        this(0);
        this.A08 = new Handler(Looper.getMainLooper(), new AnonymousClass4YM(this, 1));
        this.A09 = AnonymousClass4W3.A00(this, 30);
    }
}
