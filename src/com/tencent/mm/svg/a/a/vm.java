package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class vm
  extends c
{
  private final int height = 12;
  private final int width = 64;
  
  protected final int h(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 64;
      return 12;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Matrix localMatrix = c.e(paramVarArgs);
      float[] arrayOfFloat = c.d(paramVarArgs);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.FILL);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.STROKE);
      ((Paint)localObject1).setColor(-16777216);
      localPaint1.setStrokeWidth(1.0F);
      localPaint1.setStrokeCap(Paint.Cap.BUTT);
      localPaint1.setStrokeJoin(Paint.Join.MITER);
      localPaint1.setStrokeMiter(4.0F);
      localPaint1.setPathEffect(null);
      Object localObject2 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject2).set(localPaint1);
      ((Paint)localObject2).setStrokeWidth(1.0F);
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).set((Paint)localObject1);
      ((Paint)localObject2).setColor(-2565928);
      localCanvas.save();
      localPaint1 = c.a((Paint)localObject2, paramVarArgs);
      localPaint1.set((Paint)localObject2);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(6.0F, 12.0F);
      ((Path)localObject2).cubicTo(9.313708F, 12.0F, 12.0F, 9.313708F, 12.0F, 6.0F);
      ((Path)localObject2).cubicTo(12.0F, 2.6862915F, 9.313708F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject2).cubicTo(2.6862915F, 0.0F, 0.0F, 2.6862915F, 0.0F, 6.0F);
      ((Path)localObject2).cubicTo(0.0F, 9.313708F, 2.6862915F, 12.0F, 6.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(32.0F, 12.0F);
      ((Path)localObject2).cubicTo(35.31371F, 12.0F, 38.0F, 9.313708F, 38.0F, 6.0F);
      ((Path)localObject2).cubicTo(38.0F, 2.6862915F, 35.31371F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject2).cubicTo(28.68629F, 0.0F, 26.0F, 2.6862915F, 26.0F, 6.0F);
      ((Path)localObject2).cubicTo(26.0F, 9.313708F, 28.68629F, 12.0F, 32.0F, 12.0F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(58.0F, 12.0F);
      ((Path)localObject2).cubicTo(61.31371F, 12.0F, 64.0F, 9.313708F, 64.0F, 6.0F);
      ((Path)localObject2).cubicTo(64.0F, 2.6862915F, 61.31371F, 0.0F, 58.0F, 0.0F);
      ((Path)localObject2).cubicTo(54.68629F, 0.0F, 52.0F, 2.6862915F, 52.0F, 6.0F);
      ((Path)localObject2).cubicTo(52.0F, 9.313708F, 54.68629F, 12.0F, 58.0F, 12.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, localPaint1);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a((Paint)localObject1, paramVarArgs);
      localPaint1.set((Paint)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(6.0F, 12.0F);
      ((Path)localObject1).cubicTo(9.313708F, 12.0F, 12.0F, 9.313708F, 12.0F, 6.0F);
      ((Path)localObject1).cubicTo(12.0F, 2.6862915F, 9.313708F, 0.0F, 6.0F, 0.0F);
      ((Path)localObject1).cubicTo(2.6862915F, 0.0F, 0.0F, 2.6862915F, 0.0F, 6.0F);
      ((Path)localObject1).cubicTo(0.0F, 9.313708F, 2.6862915F, 12.0F, 6.0F, 12.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(32.0F, 12.0F);
      ((Path)localObject1).cubicTo(35.31371F, 12.0F, 38.0F, 9.313708F, 38.0F, 6.0F);
      ((Path)localObject1).cubicTo(38.0F, 2.6862915F, 35.31371F, 0.0F, 32.0F, 0.0F);
      ((Path)localObject1).cubicTo(28.68629F, 0.0F, 26.0F, 2.6862915F, 26.0F, 6.0F);
      ((Path)localObject1).cubicTo(26.0F, 9.313708F, 28.68629F, 12.0F, 32.0F, 12.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(58.0F, 12.0F);
      ((Path)localObject1).cubicTo(61.31371F, 12.0F, 64.0F, 9.313708F, 64.0F, 6.0F);
      ((Path)localObject1).cubicTo(64.0F, 2.6862915F, 61.31371F, 0.0F, 58.0F, 0.0F);
      ((Path)localObject1).cubicTo(54.68629F, 0.0F, 52.0F, 2.6862915F, 52.0F, 6.0F);
      ((Path)localObject1).cubicTo(52.0F, 9.313708F, 54.68629F, 12.0F, 58.0F, 12.0F);
      ((Path)localObject1).close();
      localObject2 = c.h(paramVarArgs);
      ((Paint)localObject2).setFlags(385);
      ((Paint)localObject2).setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      ((Paint)localObject2).setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      arrayOfFloat = c.a(arrayOfFloat, 64.0F, 0.0F, 0.0F, 0.0F, 12.0F, 0.0F);
      localMatrix.reset();
      localMatrix.setValues(arrayOfFloat);
      WeChatSVGRenderC2Java.setLinearGradient(localPaint1, 0.5F, 0.0F, 0.5F, 1.0F, new int[] { -6556649, -9903790 }, new float[] { 0.0F, 1.0F }, localMatrix, 0);
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, localPaint1);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.vm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */