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

public final class nj
  extends c
{
  private final int height = 108;
  private final int width = 108;
  
  protected final int h(int paramInt, Object... paramVarArgs)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return 0;
      return 108;
      return 108;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject2 = c.e(paramVarArgs);
      Object localObject3 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Object localObject1 = c.h(paramVarArgs);
      ((Paint)localObject1).setFlags(385);
      ((Paint)localObject1).setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      ((Paint)localObject1).setStrokeWidth(1.0F);
      ((Paint)localObject1).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject1).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject1).setStrokeMiter(4.0F);
      ((Paint)localObject1).setPathEffect(null);
      Paint localPaint2 = c.a((Paint)localObject1, paramVarArgs);
      localPaint2.set((Paint)localObject1);
      localPaint2.setStrokeWidth(1.0F);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      ((Paint)localObject1).set(localPaint1);
      ((Paint)localObject1).setColor(-10526881);
      localObject3 = c.a((float[])localObject3, 1.0F, 0.0F, 27.0F, 0.0F, 1.0F, 24.0F);
      ((Matrix)localObject2).reset();
      ((Matrix)localObject2).setValues((float[])localObject3);
      localCanvas.concat((Matrix)localObject2);
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).set((Paint)localObject1);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(21.11F, 1.23F);
      ((Path)localObject3).cubicTo(25.0F, 0.8F, 28.97F, 0.81F, 32.86F, 1.21F);
      ((Path)localObject3).cubicTo(33.54F, 2.09F, 34.16F, 3.01F, 34.72F, 3.97F);
      ((Path)localObject3).cubicTo(40.13F, 4.19F, 45.58F, 3.66F, 50.97F, 4.21F);
      ((Path)localObject3).cubicTo(53.77F, 5.17F, 52.77F, 8.75F, 53.1F, 11.0F);
      ((Path)localObject3).lineTo(0.9F, 11.0F);
      ((Path)localObject3).cubicTo(1.24F, 8.75F, 0.22F, 5.26F, 2.95F, 4.22F);
      ((Path)localObject3).cubicTo(8.37F, 3.66F, 13.84F, 4.19F, 19.29F, 3.97F);
      ((Path)localObject3).cubicTo(19.83F, 3.01F, 20.44F, 2.1F, 21.11F, 1.23F);
      ((Path)localObject3).lineTo(21.11F, 1.23F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.save();
      localObject2 = c.a((Paint)localObject1, paramVarArgs);
      ((Paint)localObject2).set((Paint)localObject1);
      localObject1 = c.i(paramVarArgs);
      ((Path)localObject1).moveTo(6.0F, 14.0F);
      ((Path)localObject1).lineTo(48.0F, 14.0F);
      ((Path)localObject1).cubicTo(47.98F, 28.03F, 48.04F, 42.05F, 47.99F, 56.08F);
      ((Path)localObject1).cubicTo(48.21F, 57.86F, 47.14F, 60.04F, 45.09F, 59.92F);
      ((Path)localObject1).cubicTo(33.36F, 60.11F, 21.62F, 59.97F, 9.89F, 59.99F);
      ((Path)localObject1).cubicTo(7.57F, 60.41F, 5.61F, 58.43F, 6.01F, 56.12F);
      ((Path)localObject1).cubicTo(5.97F, 42.08F, 6.02F, 28.04F, 6.0F, 14.0F);
      ((Path)localObject1).lineTo(6.0F, 14.0F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(15.49F, 23.47F);
      ((Path)localObject1).cubicTo(14.39F, 26.42F, 15.22F, 29.85F, 15.0F, 32.99F);
      ((Path)localObject1).cubicTo(15.09F, 38.36F, 14.84F, 43.75F, 15.05F, 49.12F);
      ((Path)localObject1).cubicTo(14.58F, 51.72F, 19.37F, 51.74F, 18.95F, 49.14F);
      ((Path)localObject1).cubicTo(19.04F, 41.05F, 19.06F, 32.95F, 18.94F, 24.86F);
      ((Path)localObject1).cubicTo(19.28F, 22.94F, 16.59F, 22.33F, 15.49F, 23.47F);
      ((Path)localObject1).lineTo(15.49F, 23.47F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(25.43F, 23.42F);
      ((Path)localObject1).cubicTo(24.45F, 31.86F, 25.2F, 40.57F, 25.05F, 49.11F);
      ((Path)localObject1).cubicTo(24.59F, 51.74F, 29.44F, 51.74F, 28.94F, 49.11F);
      ((Path)localObject1).cubicTo(29.06F, 41.05F, 29.05F, 32.97F, 28.95F, 24.91F);
      ((Path)localObject1).cubicTo(29.23F, 22.88F, 26.72F, 22.42F, 25.43F, 23.42F);
      ((Path)localObject1).lineTo(25.43F, 23.42F);
      ((Path)localObject1).close();
      ((Path)localObject1).moveTo(35.4F, 23.48F);
      ((Path)localObject1).cubicTo(34.49F, 31.92F, 35.18F, 40.59F, 35.04F, 49.11F);
      ((Path)localObject1).cubicTo(34.62F, 51.74F, 39.4F, 51.75F, 38.94F, 49.13F);
      ((Path)localObject1).cubicTo(39.05F, 41.07F, 39.05F, 32.99F, 38.94F, 24.92F);
      ((Path)localObject1).cubicTo(39.33F, 22.9F, 36.58F, 22.37F, 35.4F, 23.48F);
      ((Path)localObject1).lineTo(35.4F, 23.48F);
      ((Path)localObject1).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject1, 2);
      localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.svg.a.a.nj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */