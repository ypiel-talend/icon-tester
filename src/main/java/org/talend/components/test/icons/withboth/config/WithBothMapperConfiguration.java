package org.talend.components.test.icons.withboth.config;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "dataset" })
})
@Documentation("TODO fill the documentation for this configuration")
public class WithBothMapperConfiguration implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private DSEWithBoth dataset;

    public DSEWithBoth getDataset() {
        return dataset;
    }

    public WithBothMapperConfiguration setDataset(DSEWithBoth dataset) {
        this.dataset = dataset;
        return this;
    }
}