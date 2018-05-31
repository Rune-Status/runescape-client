import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class35 {
   @ObfuscatedName("pn")
   @ObfuscatedGetter(
      intValue = -376980529
   )
   static int field305;
   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   @Export("compass")
   static SpritePixels compass;
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = -1976888445
   )
   @Export("menuX")
   static int menuX;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1496637941
   )
   int field301;
   @ObfuscatedName("m")
   byte[][][] field299;

   class35(int var1) {
      this.field301 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "-870273324"
   )
   void method637(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field301 != 0 && this.field299 != null) {
         var8 = this.method680(var8, var7);
         var7 = this.method638(var7);
         Rasterizer2D.method5785(var1, var2, var5, var6, var3, var4, this.field299[var7 - 1][var8], this.field301);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-2130715732"
   )
   int method680(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "4002"
   )
   int method638(int var1) {
      return var1 != 9 && var1 != 10 ? (var1 == 11 ? 8 : var1) : 1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1994719964"
   )
   void method640() {
      if (this.field299 == null) {
         this.field299 = new byte[8][4][];
         this.method673();
         this.method655();
         this.method643();
         this.method644();
         this.method645();
         this.method646();
         this.method647();
         this.method648();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-119"
   )
   void method673() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[0][3] = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
   )
   void method655() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[1][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field299[1][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[1][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[1][3] = var1;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1687606976"
   )
   void method643() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[2][3] = var1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-4998204"
   )
   void method644() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[3][3] = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-57"
   )
   void method645() {
      byte[] var1 = new byte[this.field301 * this.field301];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = this.field301 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = 0; var4 < this.field301; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var2 = 0;

      for(var3 = 0; var3 < this.field301; ++var3) {
         for(var4 = this.field301 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field299[4][3] = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-670542486"
   )
   void method646() {
      byte[] var1 = new byte[this.field301 * this.field301];
      boolean var2 = false;
      var1 = new byte[this.field301 * this.field301];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var5 <= this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[5][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var4 <= this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[5][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var5 >= this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[5][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var4 >= this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[5][3] = var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2122508607"
   )
   void method647() {
      byte[] var1 = new byte[this.field301 * this.field301];
      boolean var2 = false;
      var1 = new byte[this.field301 * this.field301];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var5 <= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[6][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = this.field301 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var5 <= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[6][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = this.field301 - 1; var4 >= 0; --var4) {
         for(var5 = this.field301 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[6][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = this.field301 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[6][3] = var1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "188281095"
   )
   void method648() {
      byte[] var1 = new byte[this.field301 * this.field301];
      boolean var2 = false;
      var1 = new byte[this.field301 * this.field301];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var5 >= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[7][0] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = this.field301 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field301; ++var5) {
            if (var5 >= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[7][1] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = this.field301 - 1; var4 >= 0; --var4) {
         for(var5 = this.field301 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[7][2] = var1;
      var1 = new byte[this.field301 * this.field301];
      var3 = 0;

      for(var4 = 0; var4 < this.field301; ++var4) {
         for(var5 = this.field301 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field301 / 2) {
               var1[var3] = -1;
            }

            ++var3;
         }
      }

      this.field299[7][3] = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)Llc;",
      garbageValue = "-1346052124"
   )
   static SpritePixels method684(int var0, int var1, int var2) {
      return (SpritePixels)WorldMapRegion.field203.method4033(class120.method2812(var0, var1, var2));
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lz;III)V",
      garbageValue = "-120085475"
   )
   static void method665(class21 var0, int var1, int var2) {
      WorldMapRegion.field204.method4036(var0, class120.method2812(var1, var2, 0));
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "6"
   )
   static final void method679() {
      if (!class120.Viewport_false0) {
         int var0 = Region.pitchSin;
         int var1 = Region.pitchCos;
         int var2 = Region.yawSin;
         int var3 = Region.yawCos;
         byte var4 = 50;
         short var5 = 3500;
         int var6 = (class120.Viewport_mouseX - Graphics3D.centerX) * var4 / Graphics3D.Rasterizer3D_zoom;
         int var7 = (class120.Viewport_mouseY - Graphics3D.centerY) * var4 / Graphics3D.Rasterizer3D_zoom;
         int var8 = (class120.Viewport_mouseX - Graphics3D.centerX) * var5 / Graphics3D.Rasterizer3D_zoom;
         int var9 = (class120.Viewport_mouseY - Graphics3D.centerY) * var5 / Graphics3D.Rasterizer3D_zoom;
         int var10 = Graphics3D.method2840(var7, var4, var1, var0);
         int var11 = Graphics3D.method2842(var7, var4, var1, var0);
         var7 = var10;
         var10 = Graphics3D.method2840(var9, var5, var1, var0);
         int var12 = Graphics3D.method2842(var9, var5, var1, var0);
         var9 = var10;
         var10 = Graphics3D.method2838(var6, var11, var3, var2);
         var11 = Graphics3D.method2839(var6, var11, var3, var2);
         var6 = var10;
         var10 = Graphics3D.method2838(var8, var12, var3, var2);
         var12 = Graphics3D.method2839(var8, var12, var3, var2);
         class120.field1684 = (var6 + var10) / 2;
         class148.field1936 = (var9 + var7) / 2;
         class304.field3737 = (var11 + var12) / 2;
         NPC.field1056 = (var10 - var6) / 2;
         Name.field3662 = (var9 - var7) / 2;
         class120.field1685 = (var12 - var11) / 2;
         Fonts.field3692 = Math.abs(NPC.field1056);
         Signlink.field1980 = Math.abs(Name.field3662);
         class120.field1682 = Math.abs(class120.field1685);
      }

   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1790454621"
   )
   static final void method682(int var0, int var1, int var2, int var3) {
      ++Client.field690;
      if (MilliTimer.localPlayer.x >> 7 == Client.destinationX && MilliTimer.localPlayer.y >> 7 == Client.destinationY) {
         Client.destinationX = 0;
      }

      class145.method3200();
      GrandExchangeEvents.method14();
      class120.method2813(true);
      int var4 = class81.playerIndexesCount;
      int[] var5 = class81.playerIndices;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         if (var5[var6] != Client.field719 && var5[var6] != Client.localInteractingIndex) {
            class32.method586(Client.cachedPlayers[var5[var6]], true);
         }
      }

      class120.method2813(false);
      Varcs.method1932();
      class32.method595();
      Occluder.method3113(var0, var1, var2, var3, true);
      var0 = Client.Viewport_xOffset;
      var1 = Client.Viewport_yOffset;
      var2 = Client.viewportWidth;
      var3 = Client.viewportHeight;
      Rasterizer2D.setDrawRegion(var0, var1, var0 + var2, var3 + var1);
      Graphics3D.Rasterizer3D_method1();
      int var7;
      if (!Client.field746) {
         var4 = Client.cameraPitchTarget;
         if (Client.field723 / 256 > var4) {
            var4 = Client.field723 / 256;
         }

         if (Client.field835[4] && Client.field837[4] + 128 > var4) {
            var4 = Client.field837[4] + 128;
         }

         var7 = Client.mapAngle & 2047;
         Occluder.method3111(Signlink.field1979, Client.field857, ItemContainer.field481, var4, var7, var4 * 3 + 600);
      }

      if (!Client.field746) {
         var4 = GameSocket.method3411();
      } else {
         var4 = class187.method3860();
      }

      var7 = WorldMapType3.cameraX;
      var6 = Size.cameraZ;
      int var8 = class13.cameraY;
      int var9 = class146.cameraPitch;
      int var10 = WidgetNode.cameraYaw;

      int var11;
      int var12;
      for(var11 = 0; var11 < 5; ++var11) {
         if (Client.field835[var11]) {
            var12 = (int)(Math.random() * (double)(Client.field836[var11] * 2 + 1) - (double)Client.field836[var11] + Math.sin((double)Client.field765[var11] * ((double)Client.field855[var11] / 100.0D)) * (double)Client.field837[var11]);
            if (var11 == 0) {
               WorldMapType3.cameraX += var12;
            }

            if (var11 == 1) {
               Size.cameraZ += var12;
            }

            if (var11 == 2) {
               class13.cameraY += var12;
            }

            if (var11 == 3) {
               WidgetNode.cameraYaw = var12 + WidgetNode.cameraYaw & 2047;
            }

            if (var11 == 4) {
               class146.cameraPitch += var12;
               if (class146.cameraPitch < 128) {
                  class146.cameraPitch = 128;
               }

               if (class146.cameraPitch > 383) {
                  class146.cameraPitch = 383;
               }
            }
         }
      }

      var11 = MouseInput.mouseLastX;
      var12 = MouseInput.mouseLastY;
      if (MouseInput.mouseLastButton != 0) {
         var11 = MouseInput.mouseLastPressedX;
         var12 = MouseInput.mouseLastPressedY;
      }

      if (var11 >= var0 && var11 < var0 + var2 && var12 >= var1 && var12 < var3 + var1) {
         class24.method460(var11 - var0, var12 - var1);
      } else {
         class219.method4362();
      }

      Varbit.method4951();
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
      Varbit.method4951();
      int var13 = Graphics3D.Rasterizer3D_zoom;
      Graphics3D.Rasterizer3D_zoom = Client.scale;
      ScriptEvent.region.drawRegion(WorldMapType3.cameraX, Size.cameraZ, class13.cameraY, class146.cameraPitch, WidgetNode.cameraYaw, var4);
      Graphics3D.Rasterizer3D_zoom = var13;
      Varbit.method4951();
      ScriptEvent.region.clearEntities();
      Client.overheadTextCount = 0;
      boolean var14 = false;
      int var15 = -1;
      int var16 = -1;
      int var17 = class81.playerIndexesCount;
      int[] var18 = class81.playerIndices;

      int var19;
      for(var19 = 0; var19 < var17 + Client.npcIndexesCount; ++var19) {
         Object var20;
         if (var19 < var17) {
            var20 = Client.cachedPlayers[var18[var19]];
            if (var18[var19] == Client.field719) {
               var14 = true;
               var15 = var19;
               continue;
            }

            if (var20 == MilliTimer.localPlayer) {
               var16 = var19;
               continue;
            }
         } else {
            var20 = Client.cachedNPCs[Client.npcIndices[var19 - var17]];
         }

         Widget.draw2DExtras((Actor)var20, var19, var0, var1, var2, var3);
      }

      if (Client.field711 && var16 != -1) {
         Widget.draw2DExtras(MilliTimer.localPlayer, var16, var0, var1, var2, var3);
      }

      if (var14) {
         Widget.draw2DExtras(Client.cachedPlayers[Client.field719], var15, var0, var1, var2, var3);
      }

      int var29;
      for(var19 = 0; var19 < Client.overheadTextCount; ++var19) {
         var29 = Client.overheadTextsX[var19];
         int var21 = Client.overheadTextsY[var19];
         int var22 = Client.overheadTextsOffsetX[var19];
         int var23 = Client.overheadTextsOffsetY[var19];
         boolean var24 = true;

         while(var24) {
            var24 = false;

            for(int var25 = 0; var25 < var19; ++var25) {
               if (var21 + 2 > Client.overheadTextsY[var25] - Client.overheadTextsOffsetY[var25] && var21 - var23 < Client.overheadTextsY[var25] + 2 && var29 - var22 < Client.overheadTextsOffsetX[var25] + Client.overheadTextsX[var25] && var22 + var29 > Client.overheadTextsX[var25] - Client.overheadTextsOffsetX[var25] && Client.overheadTextsY[var25] - Client.overheadTextsOffsetY[var25] < var21) {
                  var21 = Client.overheadTextsY[var25] - Client.overheadTextsOffsetY[var25];
                  var24 = true;
               }
            }
         }

         Client.screenX = Client.overheadTextsX[var19];
         Client.screenY = Client.overheadTextsY[var19] = var21;
         String var30 = Client.overheadTexts[var19];
         if (Client.field754 == 0) {
            int var26 = 16776960;
            if (Client.field811[var19] < 6) {
               var26 = Client.field805[Client.field811[var19]];
            }

            if (Client.field811[var19] == 6) {
               var26 = Client.field690 % 20 < 10 ? 16711680 : 16776960;
            }

            if (Client.field811[var19] == 7) {
               var26 = Client.field690 % 20 < 10 ? 255 : '\uffff';
            }

            if (Client.field811[var19] == 8) {
               var26 = Client.field690 % 20 < 10 ? '뀀' : 8454016;
            }

            int var27;
            if (Client.field811[var19] == 9) {
               var27 = 150 - Client.overheadTextsCyclesRemaining[var19];
               if (var27 < 50) {
                  var26 = var27 * 1280 + 16711680;
               } else if (var27 < 100) {
                  var26 = 16776960 - (var27 - 50) * 327680;
               } else if (var27 < 150) {
                  var26 = (var27 - 100) * 5 + '\uff00';
               }
            }

            if (Client.field811[var19] == 10) {
               var27 = 150 - Client.overheadTextsCyclesRemaining[var19];
               if (var27 < 50) {
                  var26 = var27 * 5 + 16711680;
               } else if (var27 < 100) {
                  var26 = 16711935 - (var27 - 50) * 327680;
               } else if (var27 < 150) {
                  var26 = (var27 - 100) * 327680 + 255 - (var27 - 100) * 5;
               }
            }

            if (Client.field811[var19] == 11) {
               var27 = 150 - Client.overheadTextsCyclesRemaining[var19];
               if (var27 < 50) {
                  var26 = 16777215 - var27 * 327685;
               } else if (var27 < 100) {
                  var26 = (var27 - 50) * 327685 + '\uff00';
               } else if (var27 < 150) {
                  var26 = 16777215 - (var27 - 100) * 327680;
               }
            }

            if (Client.field686[var19] == 0) {
               WidgetNode.fontBold12.drawTextCentered(var30, var0 + Client.screenX, Client.screenY + var1, var26, 0);
            }

            if (Client.field686[var19] == 1) {
               WidgetNode.fontBold12.method5546(var30, var0 + Client.screenX, Client.screenY + var1, var26, 0, Client.field690);
            }

            if (Client.field686[var19] == 2) {
               WidgetNode.fontBold12.method5547(var30, var0 + Client.screenX, Client.screenY + var1, var26, 0, Client.field690);
            }

            if (Client.field686[var19] == 3) {
               WidgetNode.fontBold12.method5548(var30, var0 + Client.screenX, Client.screenY + var1, var26, 0, Client.field690, 150 - Client.overheadTextsCyclesRemaining[var19]);
            }

            if (Client.field686[var19] == 4) {
               var27 = (150 - Client.overheadTextsCyclesRemaining[var19]) * (WidgetNode.fontBold12.getTextWidth(var30) + 100) / 150;
               Rasterizer2D.setInnerDrawRegion(var0 + Client.screenX - 50, var1, var0 + Client.screenX + 50, var3 + var1);
               WidgetNode.fontBold12.method5541(var30, var0 + Client.screenX + 50 - var27, Client.screenY + var1, var26, 0);
               Rasterizer2D.setDrawRegion(var0, var1, var0 + var2, var3 + var1);
            }

            if (Client.field686[var19] == 5) {
               var27 = 150 - Client.overheadTextsCyclesRemaining[var19];
               int var28 = 0;
               if (var27 < 25) {
                  var28 = var27 - 25;
               } else if (var27 > 125) {
                  var28 = var27 - 125;
               }

               Rasterizer2D.setInnerDrawRegion(var0, Client.screenY + var1 - WidgetNode.fontBold12.verticalSpace - 1, var0 + var2, Client.screenY + var1 + 5);
               WidgetNode.fontBold12.drawTextCentered(var30, var0 + Client.screenX, var28 + Client.screenY + var1, var26, 0);
               Rasterizer2D.setDrawRegion(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            WidgetNode.fontBold12.drawTextCentered(var30, var0 + Client.screenX, Client.screenY + var1, 16776960, 0);
         }
      }

      World.method1647(var0, var1);
      ((TextureProvider)Graphics3D.textureLoader).checkTextures(Client.field654);
      if (Client.field664) {
         if (Client.cursorState == 1) {
            FileOnDisk.crossSprites[Client.field843 / 100].drawAt(Client.lastLeftClickX - 8, Client.lastLeftClickY - 8);
         }

         if (Client.cursorState == 2) {
            FileOnDisk.crossSprites[Client.field843 / 100 + 4].drawAt(Client.lastLeftClickX - 8, Client.lastLeftClickY - 8);
         }
      }

      Client.myPlayerIndex = 0;
      var29 = (MilliTimer.localPlayer.x >> 7) + class178.baseX;
      var15 = (MilliTimer.localPlayer.y >> 7) + CombatInfoListHolder.baseY;
      if (var29 >= 3053 && var29 <= 3156 && var15 >= 3056 && var15 <= 3136) {
         Client.myPlayerIndex = 1;
      }

      if (var29 >= 3072 && var29 <= 3118 && var15 >= 9492 && var15 <= 9535) {
         Client.myPlayerIndex = 1;
      }

      if (Client.myPlayerIndex == 1 && var29 >= 3139 && var29 <= 3199 && var15 >= 3008 && var15 <= 3062) {
         Client.myPlayerIndex = 0;
      }

      WorldMapType3.cameraX = var7;
      Size.cameraZ = var6;
      class13.cameraY = var8;
      class146.cameraPitch = var9;
      WidgetNode.cameraYaw = var10;
      if (Client.field603 && FileOnDisk.method2580(true, false) == 0) {
         Client.field603 = false;
      }

      if (Client.field603) {
         Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
         class16.method187("Loading - please wait.", false);
      }

   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(Lhl;IIB)V",
      garbageValue = "-80"
   )
   static final void method685(Widget var0, int var1, int var2) {
      if (Client.draggedWidget == null && !Client.isMenuOpen && var0 != null && IndexFile.method3387(var0) != null) {
         Client.draggedWidget = var0;
         Client.field639 = IndexFile.method3387(var0);
         Client.field685 = var1;
         Client.field766 = var2;
         DecorativeObject.field1860 = 0;
         Client.draggingWidget = false;
         int var3 = Client.menuOptionCount - 1;
         if (var3 != -1) {
            class184.topContextMenuRow = new ContextMenuRow();
            class184.topContextMenuRow.param0 = Client.menuActionParams0[var3];
            class184.topContextMenuRow.param1 = Client.menuActionParams1[var3];
            class184.topContextMenuRow.type = Client.menuTypes[var3];
            class184.topContextMenuRow.identifier = Client.menuIdentifiers[var3];
            class184.topContextMenuRow.option = Client.menuOptions[var3];
         }
      }

   }
}
