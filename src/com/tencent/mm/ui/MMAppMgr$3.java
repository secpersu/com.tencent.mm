package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class MMAppMgr$3
  implements DialogInterface.OnClickListener
{
  MMAppMgr$3(Activity paramActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    MMAppMgr.b(cms, true);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */