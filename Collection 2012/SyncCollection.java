import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
public class SyncCollection
{	
	public static void main(String... w)	
	{
		Collection c=Collections.synchronizedCollection(new ArrayList());
		List l=Collections.synchronizedList(new ArrayList());
		Set s=Collections.synchronizedSet(new HashSet());
		Map m=Collections.synchronizedMap(new HashMap());
	}
}

/*

static <T> Collection<T>	synchronizedCollection(Collection<T> c)
Returns a synchronized (thread-safe) collection backed by the specified collection.

static <T> List<T>	synchronizedList(List<T> list)
Returns a synchronized (thread-safe) list backed by the specified list.

static <K,V> Map<K,V>	synchronizedMap(Map<K,V> m)
Returns a synchronized (thread-safe) map backed by the specified map.

static <T> Set<T>	synchronizedSet(Set<T> s)
Returns a synchronized (thread-safe) set backed by the specified set.

static <K,V> SortedMap<K,V>	synchronizedSortedMap(SortedMap<K,V> m)
Returns a synchronized (thread-safe) sorted map backed by the specified sorted map.

static <T> SortedSet<T>	synchronizedSortedSet(SortedSet<T> s)
Returns a synchronized (thread-safe) sorted set backed by the specified sorted set.
s*/