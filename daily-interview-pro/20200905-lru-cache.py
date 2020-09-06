from collections import OrderedDict

class LRUCache:
    def __init__(self, space):
        self.space = space
        self.map = OrderedDict()

    def get(self, key):
        if key not in self.map:
            return None

        val = self.map[key]
        del self.map[key]
        self.map[key] = val

        return val

    def put(self, key, value):
        if key not in self.map:
            self.map[key] = value
            
            if len(self.map) > self.space:
                self.map.popitem(last = False)
        else:
            val = self.map[key]
            del self.map[key]
            self.map[key] = val

cache = LRUCache(2)
cache.put(3, 3)
cache.put(4, 4)
print(cache.get(3)) # 3
print(cache.get(2)) # None

cache.put(2, 2)
print(cache.get(4)) # None
print(cache.get(3)) # 3
