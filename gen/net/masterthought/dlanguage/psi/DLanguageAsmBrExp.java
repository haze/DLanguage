// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageAsmBrExp extends PsiElement {

  @Nullable
  DLanguageAsmExp getAsmExp();

  @NotNull
  DLanguageAsmUnaExp getAsmUnaExp();

  @Nullable
  PsiElement getOpBracketLeft();

  @Nullable
  PsiElement getOpBracketRight();

}
