package com.tencent.mm.s;

import com.tencent.mm.network.e;
import com.tencent.mm.network.o;
import com.tencent.mm.protocal.b.auj;
import com.tencent.mm.protocal.b.auk;
import com.tencent.mm.r.a;
import com.tencent.mm.r.a.a;
import com.tencent.mm.r.a.b;
import com.tencent.mm.r.d;

public final class b
  extends com.tencent.mm.r.j
  implements com.tencent.mm.network.j
{
  private d anM;
  private a anN;
  
  public b(String paramString)
  {
    a.a locala = new a.a();
    bFa = new auj();
    bFb = new auk();
    uri = "/cgi-bin/micromsg-bin/unbindqq";
    bEY = 253;
    bFc = 0;
    bFd = 0;
    anN = locala.vy();
    anN.bEW.bFf).jiB = paramString;
  }
  
  public final int a(e parame, d paramd)
  {
    anM = paramd;
    return a(parame, anN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, o paramo, byte[] paramArrayOfByte)
  {
    anM.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 253;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */