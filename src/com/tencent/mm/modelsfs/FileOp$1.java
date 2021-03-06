package com.tencent.mm.modelsfs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

final class FileOp$1
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("com.tencent.mm.FileOp.registerSFS"))
    {
      paramContext = paramIntent.getByteArrayExtra("rec");
      if (paramContext != null) {}
    }
    do
    {
      do
      {
        return;
        paramIntent = Parcel.obtain();
        paramIntent.unmarshall(paramContext, 0, paramContext.length);
        paramIntent.setDataPosition(0);
        paramIntent = (FileOp.SFSContextRec)FileOp.SFSContextRec.CREATOR.createFromParcel(paramIntent);
      } while (paramIntent == null);
      paramContext = cat;
      FileOp.Ci().writeLock().lock();
      paramIntent = (FileOp.SFSContextRec)FileOp.Cj().put(paramContext, paramIntent);
      FileOp.Ci().writeLock().unlock();
      if ((paramIntent != null) && (cax != null)) {
        cax.release();
      }
      u.i("!24@/B4Tb64lLpJsxiXOTpu//A==", "Load mapping from broadcast: " + paramContext);
      return;
      if (paramIntent.getAction().equals("com.tencent.mm.FileOp.unregisterSFS"))
      {
        paramContext = paramIntent.getStringExtra("prefix");
        FileOp.Ci().writeLock().lock();
        paramIntent = (FileOp.SFSContextRec)FileOp.Cj().remove(paramContext);
        FileOp.Ci().writeLock().unlock();
        if ((paramIntent != null) && (cax != null)) {
          cax.release();
        }
        u.i("!24@/B4Tb64lLpJsxiXOTpu//A==", "Unload mapping from broadcast: " + paramContext);
        return;
      }
    } while (!paramIntent.getAction().equals("com.tencent.mm.FileOp.clearSFS"));
    FileOp.Ci().writeLock().lock();
    paramContext = FileOp.Cj().values().iterator();
    while (paramContext.hasNext())
    {
      paramIntent = (FileOp.SFSContextRec)paramContext.next();
      if ((paramIntent != null) && (cax != null)) {
        cax.release();
      }
    }
    FileOp.Cj().clear();
    FileOp.Ci().writeLock().unlock();
    u.i("!24@/B4Tb64lLpJsxiXOTpu//A==", "Clear mapping from broadcast.");
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.modelsfs.FileOp.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */