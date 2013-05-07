package com.google.typography.font.sfntly.table.opentype;

import com.google.typography.font.sfntly.data.ReadableFontData;
import com.google.typography.font.sfntly.table.opentype.component.TagOffsetsTable;
import com.google.typography.font.sfntly.table.opentype.component.VisibleBuilder;

public class ScriptListTable extends TagOffsetsTable<ScriptTable> {

  public ScriptListTable(ReadableFontData data, boolean dataIsCanonical) {
    super(data, dataIsCanonical);
  }

  @Override
  protected ScriptTable readSubTable(ReadableFontData data, boolean dataIsCanonical) {
    return new ScriptTable(data, 0, dataIsCanonical);
  }

  public static class Builder extends TagOffsetsTable.Builder<ScriptListTable, ScriptTable> {

    @Override
    protected VisibleBuilder<ScriptTable> createSubTableBuilder(
        ReadableFontData data, int tag, boolean dataIsCanonical) {
      return new ScriptTable.Builder(data, 0, dataIsCanonical);
    }

    @Override
    protected VisibleBuilder<ScriptTable> createSubTableBuilder() {
      return new ScriptTable.Builder();
    }

    @Override
    protected ScriptListTable readTable(
        ReadableFontData data, int baseUnused, boolean dataIsCanonical) {
      return new ScriptListTable(data, dataIsCanonical);
    }

    @Override
    protected void initFields() {
    }

    @Override
    public int fieldCount() {
      return 0;
    }
  }

  @Override
  public int fieldCount() {
    return 0;
  }
}
