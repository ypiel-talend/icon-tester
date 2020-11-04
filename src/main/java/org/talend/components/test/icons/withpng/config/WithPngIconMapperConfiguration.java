package org.talend.components.test.icons.withpng.config;

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
public class WithPngIconMapperConfiguration implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private DSEWithPng dataset;

    public DSEWithPng getDataset() {
        return dataset;
    }

    public WithPngIconMapperConfiguration setDataset(DSEWithPng dataset) {
        this.dataset = dataset;
        return this;
    }
}