class Checker implements Comparator<Player>
    {
        public int compare (Player a, Player b)
           {
                return a.score!=b.score ? (b.score - a.score) : a.name.compareTo(b.name);
        }
}