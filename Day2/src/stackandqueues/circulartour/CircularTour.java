package stackandqueues.circulartour;

class CircularTour {
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    // Function to find the starting point of circular tour
    int findTour(PetrolPump[] pumps) {
        int totalPetrol = 0, totalDistance = 0;
        int start = 0, currentPetrol = 0;

        for (int i = 0; i < pumps.length; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;
            currentPetrol += pumps[i].petrol - pumps[i].distance;

            // If current petrol is negative, reset start point
            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }

        return (totalPetrol >= totalDistance) ? start : -1;
    }

    public static void main(String[] args) {
        CircularTour ct = new CircularTour();
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int start = ct.findTour(pumps);
        System.out.println("Start at pump: " + (start != -1 ? start : "No solution"));
    }
}
