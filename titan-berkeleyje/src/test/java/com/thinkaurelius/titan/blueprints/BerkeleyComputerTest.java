package com.thinkaurelius.titan.blueprints;

import com.thinkaurelius.titan.core.TitanGraph;
import org.apache.tinkerpop.gremlin.process.ProcessComputerSuite;
import org.junit.runner.RunWith;

/**
 * @author Matthias Broecheler (me@matthiasb.com)
 */
@RunWith(ProcessComputerSuite.class)
@ProcessComputerSuite.GraphProviderClass(provider = BerkeleyGraphComputerProvider.class, graph = TitanGraph.class)
public class BerkeleyComputerTest {
}