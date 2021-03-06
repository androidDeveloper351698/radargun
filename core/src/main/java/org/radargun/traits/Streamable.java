package org.radargun.traits;

import java.util.stream.Stream;

import org.radargun.Operation;

/**
 * @author Roman Macor &lt;rmacor@redhat.com&gt;
 */
@Trait(doc = "Provides interface for executing distributed tasks on streams")
public interface Streamable {
   String TRAIT = Streamable.class.getSimpleName();
   Operation STREAMABLE = Operation.register(TRAIT + ".Streamable");

   Stream stream(String resourceName);

   Stream parallelStream(String resourceName);
}
