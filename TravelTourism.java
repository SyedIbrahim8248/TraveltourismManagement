package Tourism.java;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


//public class TravelTourism {

//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.Map;

    public class TravelTourism extends JFrame {

        static ArrayList<String> bookings = new ArrayList<>();
        static ArrayList<String> customers = new ArrayList<>();

        static LinkedHashMap<String, String[]> locations = new LinkedHashMap<>();

        public TravelTourism() {
            loadIndiaData();
            showLogin();
        }

        // ================= INDIA DATA =================

        static void loadIndiaData() {

            locations.put("Andhra Pradesh",
                    new String[]{"Visakhapatnam", "Vijayawada", "Tirupati", "Guntur", "Kurnool"});

            locations.put("Arunachal Pradesh",
                    new String[]{"Itanagar", "Tawang", "Bomdila", "Ziro", "Pasighat"});

            locations.put("Assam",
                    new String[]{"Guwahati", "Dibrugarh", "Jorhat", "Tezpur", "Silchar"});

            locations.put("Bihar",
                    new String[]{"Patna", "Gaya", "Nalanda", "Muzaffarpur", "Bhagalpur"});

            locations.put("Chhattisgarh",
                    new String[]{"Raipur", "Bilaspur", "Durg", "Bastar", "Korba"});

            locations.put("Goa",
                    new String[]{"Panaji", "Margao", "Vasco da Gama", "Calangute", "Baga"});

            locations.put("Gujarat",
                    new String[]{"Ahmedabad", "Surat", "Vadodara", "Rajkot", "Dwarka", "Somnath"});

            locations.put("Haryana",
                    new String[]{"Gurugram", "Faridabad", "Panipat", "Rohtak", "Hisar", "Karnal"});

            locations.put("Himachal Pradesh",
                    new String[]{"Shimla", "Manali", "Dharamshala", "Kullu", "Kasol"});

            locations.put("Jharkhand",
                    new String[]{"Ranchi", "Jamshedpur", "Dhanbad", "Deoghar", "Bokaro"});

            locations.put("Karnataka",
                    new String[]{"Bengaluru", "Mysuru", "Mangaluru", "Coorg", "Hampi"});

            locations.put("Kerala",
                    new String[]{"Thiruvananthapuram", "Kochi", "Munnar", "Alappuzha", "Kozhikode"});

            locations.put("Madhya Pradesh",
                    new String[]{"Bhopal", "Indore", "Gwalior", "Jabalpur", "Ujjain", "Khajuraho"});

            locations.put("Maharashtra",
                    new String[]{"Mumbai", "Pune", "Nashik", "Nagpur", "Aurangabad", "Lonavala"});

            locations.put("Manipur",
                    new String[]{"Imphal", "Churachandpur", "Ukhrul", "Thoubal"});

            locations.put("Meghalaya",
                    new String[]{"Shillong", "Cherrapunji", "Tura", "Jowai"});

            locations.put("Mizoram",
                    new String[]{"Aizawl", "Lunglei", "Champhai", "Serchhip"});

            locations.put("Nagaland",
                    new String[]{"Kohima", "Dimapur", "Mokokchung", "Mon"});

            locations.put("Odisha",
                    new String[]{"Bhubaneswar", "Puri", "Cuttack", "Konark", "Rourkela"});

            locations.put("Punjab",
                    new String[]{"Amritsar", "Ludhiana", "Jalandhar", "Patiala", "Bathinda"});

            locations.put("Rajasthan",
                    new String[]{"Jaipur", "Jodhpur", "Udaipur", "Jaisalmer", "Ajmer", "Pushkar"});

            locations.put("Sikkim",
                    new String[]{"Gangtok", "Pelling", "Namchi", "Lachung"});

            locations.put("Tamil Nadu",
                    new String[]{"Chennai", "Coimbatore", "Madurai", "Ooty", "Rameswaram", "Kanyakumari"});

            locations.put("Telangana",
                    new String[]{"Hyderabad", "Warangal", "Nizamabad", "Karimnagar"});

            locations.put("Tripura",
                    new String[]{"Agartala", "Udaipur", "Dharmanagar", "Kailashahar"});

            locations.put("Uttar Pradesh",
                    new String[]{"Lucknow", "Agra", "Varanasi", "Prayagraj", "Kanpur", "Mathura", "Ayodhya"});

            locations.put("Uttarakhand",
                    new String[]{"Dehradun", "Nainital", "Rishikesh", "Haridwar", "Mussoorie", "Kedarnath"});

            locations.put("West Bengal",
                    new String[]{"Kolkata", "Darjeeling", "Siliguri", "Durgapur", "Howrah"});

            // Union Territories

            locations.put("Delhi",
                    new String[]{"New Delhi", "Old Delhi", "Dwarka", "Rohini"});

            locations.put("Jammu and Kashmir",
                    new String[]{"Srinagar", "Jammu", "Gulmarg", "Pahalgam", "Sonamarg"});

            locations.put("Ladakh",
                    new String[]{"Leh", "Kargil", "Nubra Valley", "Pangong"});

            locations.put("Chandigarh",
                    new String[]{"Chandigarh"});

            locations.put("Puducherry",
                    new String[]{"Puducherry", "Auroville", "Mahe"});

            locations.put("Andaman and Nicobar Islands",
                    new String[]{"Port Blair", "Havelock Island", "Neil Island"});

            locations.put("Dadra and Nagar Haveli and Daman and Diu",
                    new String[]{"Daman", "Diu", "Silvassa"});

            locations.put("Lakshadweep",
                    new String[]{"Kavaratti", "Agatti", "Bangaram"});
        }

        // ================= LOGIN =================

        void showLogin() {

            getContentPane().removeAll();

            setTitle("Travel & Tourism Management System");
            setSize(550, 400);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JLabel title = new JLabel("TRAVEL & TOURISM MANAGEMENT");
            title.setFont(new Font("Arial", Font.BOLD, 22));
            title.setBounds(85, 35, 400, 40);
            add(title);

            JLabel userLabel = new JLabel("Username:");
            userLabel.setBounds(90, 110, 100, 30);
            add(userLabel);

            JTextField username = new JTextField();
            username.setBounds(200, 110, 220, 30);
            add(username);

            JLabel passLabel = new JLabel("Password:");
            passLabel.setBounds(90, 160, 100, 30);
            add(passLabel);

            JPasswordField password = new JPasswordField();
            password.setBounds(200, 160, 220, 30);
            add(password);

            JButton login = new JButton("LOGIN");
            login.setBounds(200, 215, 100, 35);
            add(login);

            JButton register = new JButton("REGISTER");
            register.setBounds(310, 215, 110, 35);
            add(register);

            JLabel demo = new JLabel("Demo Login: admin / 1234");
            demo.setBounds(185, 275, 220, 30);
            add(demo);

            login.addActionListener(e -> {

                String user = username.getText();
                String pass = new String(password.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {
                    dashboard();
                } else {
                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid Username or Password!"
                    );
                }
            });

            register.addActionListener(e -> registerCustomer());

            revalidate();
            repaint();
        }

        // ================= REGISTRATION =================

        void registerCustomer() {

            JTextField name = new JTextField();
            JTextField email = new JTextField();
            JTextField phone = new JTextField();
            JTextField address = new JTextField();

            Object[] fields = {
                    "Full Name:", name,
                    "Email:", email,
                    "Phone:", phone,
                    "Address:", address
            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    fields,
                    "Customer Registration",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {

                if (name.getText().isEmpty() ||
                        email.getText().isEmpty() ||
                        phone.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Please fill all required fields!"
                    );
                    return;
                }

                String customer =
                        name.getText() + " | " +
                                email.getText() + " | " +
                                phone.getText() + " | " +
                                address.getText();

                customers.add(customer);

                JOptionPane.showMessageDialog(
                        this,
                        "Registration Successful!"
                );
            }
        }

        // ================= DASHBOARD =================

        void dashboard() {

            getContentPane().removeAll();

            setTitle("Travel & Tourism Dashboard");
            setSize(800, 600);
            setLocationRelativeTo(null);
            setLayout(null);

            JLabel title = new JLabel("TRAVEL & TOURISM MANAGEMENT");
            title.setFont(new Font("Arial", Font.BOLD, 24));
            title.setBounds(180, 20, 450, 40);
            add(title);

            JButton states = new JButton("🇮🇳 States & Cities");
            states.setBounds(80, 90, 190, 50);
            add(states);

            JButton destinations = new JButton("Destinations");
            destinations.setBounds(300, 90, 190, 50);
            add(destinations);

            JButton packages = new JButton("Travel Packages");
            packages.setBounds(520, 90, 190, 50);
            add(packages);

            JButton hotels = new JButton("Hotels");
            hotels.setBounds(80, 160, 190, 50);
            add(hotels);

            JButton booking = new JButton("Book Trip");
            booking.setBounds(300, 160, 190, 50);
            add(booking);

            JButton viewBooking = new JButton("View Bookings");
            viewBooking.setBounds(520, 160, 190, 50);
            add(viewBooking);

            JButton search = new JButton("Search");
            search.setBounds(80, 230, 190, 50);
            add(search);

            JButton cancel = new JButton("Cancel Booking");
            cancel.setBounds(300, 230, 190, 50);
            add(cancel);

            JButton customersButton = new JButton("Customers");
            customersButton.setBounds(520, 230, 190, 50);
            add(customersButton);

            JButton admin = new JButton("Admin Panel");
            admin.setBounds(190, 310, 190, 50);
            add(admin);

            JButton logout = new JButton("Logout");
            logout.setBounds(410, 310, 190, 50);
            add(logout);

            JButton exit = new JButton("Exit");
            exit.setBounds(300, 390, 190, 50);
            add(exit);

            states.addActionListener(e -> showStates());

            destinations.addActionListener(e -> destinations());

            packages.addActionListener(e -> packages());

            hotels.addActionListener(e -> hotels());

            booking.addActionListener(e -> bookTrip());

            viewBooking.addActionListener(e -> viewBookings());

            search.addActionListener(e -> search());

            cancel.addActionListener(e -> cancelBooking());

            customersButton.addActionListener(e -> showCustomers());

            admin.addActionListener(e -> adminPanel());

            logout.addActionListener(e -> showLogin());

            exit.addActionListener(e -> System.exit(0));

            revalidate();
            repaint();
        }

        // ================= STATES =================

        void showStates() {

            StringBuilder data =
                    new StringBuilder("INDIA - STATES / UNION TERRITORIES\n\n");

            for (Map.Entry<String, String[]> entry : locations.entrySet()) {

                data.append("STATE/UT: ")
                        .append(entry.getKey())
                        .append("\n");

                data.append("Cities: ");

                for (String city : entry.getValue()) {
                    data.append(city).append(", ");
                }

                data.append("\n\n");
            }

            JTextArea area = new JTextArea(data.toString());
            area.setEditable(false);

            JScrollPane scroll = new JScrollPane(area);
            scroll.setPreferredSize(new Dimension(650, 450));

            JOptionPane.showMessageDialog(
                    this,
                    scroll,
                    "India States & Cities",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= DESTINATIONS =================

        void destinations() {

            String data =
                    "POPULAR TOURIST DESTINATIONS\n\n" +
                            "Taj Mahal - Agra\n" +
                            "India Gate - Delhi\n" +
                            "Goa Beaches - Goa\n" +
                            "Dal Lake - Kashmir\n" +
                            "Manali - Himachal Pradesh\n" +
                            "Jaipur - Rajasthan\n" +
                            "Kerala Backwaters - Kerala\n" +
                            "Golden Temple - Punjab\n" +
                            "Ooty - Tamil Nadu\n" +
                            "Munnar - Kerala\n" +
                            "Hampi - Karnataka\n" +
                            "Darjeeling - West Bengal\n" +
                            "Rishikesh - Uttarakhand\n" +
                            "Leh - Ladakh\n" +
                            "Shillong - Meghalaya";

            JOptionPane.showMessageDialog(
                    this,
                    data,
                    "Tourist Destinations",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= PACKAGES =================

        void packages() {

            String data =
                    "TRAVEL PACKAGES\n\n" +
                            "1. Goa Package - 3 Days - ₹8,999\n" +
                            "2. Manali Package - 5 Days - ₹14,999\n" +
                            "3. Kashmir Package - 6 Days - ₹19,999\n" +
                            "4. Rajasthan Package - 5 Days - ₹12,999\n" +
                            "5. Kerala Package - 4 Days - ₹11,999\n" +
                            "6. Delhi-Agra Package - 3 Days - ₹7,999\n" +
                            "7. Ladakh Package - 7 Days - ₹24,999\n" +
                            "8. South India Package - 7 Days - ₹21,999";

            JOptionPane.showMessageDialog(
                    this,
                    data,
                    "Travel Packages",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= HOTELS =================

        void hotels() {

            String data =
                    "HOTEL INFORMATION\n\n" +
                            "Goa Beach Resort - ₹3,000/night\n" +
                            "Manali Mountain Hotel - ₹2,500/night\n" +
                            "Kashmir Dal Lake Hotel - ₹3,500/night\n" +
                            "Jaipur Royal Hotel - ₹2,800/night\n" +
                            "Kerala Backwater Resort - ₹3,200/night\n" +
                            "Delhi City Hotel - ₹2,700/night\n" +
                            "Leh Mountain Resort - ₹4,000/night";

            JOptionPane.showMessageDialog(
                    this,
                    data,
                    "Hotels",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= BOOKING =================

        void bookTrip() {

            JTextField name = new JTextField();
            JTextField date = new JTextField();
            JTextField persons = new JTextField();

            JComboBox<String> state =
                    new JComboBox<>(
                            locations.keySet().toArray(new String[0])
                    );

            JComboBox<String> packageBox =
                    new JComboBox<>(new String[]{
                            "Goa - ₹8999",
                            "Manali - ₹14999",
                            "Kashmir - ₹19999",
                            "Rajasthan - ₹12999",
                            "Kerala - ₹11999",
                            "Ladakh - ₹24999"
                    });

            Object[] fields = {
                    "Customer Name:", name,
                    "State / UT:", state,
                    "Travel Date:", date,
                    "Number of Persons:", persons,
                    "Package:", packageBox
            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    fields,
                    "Trip Booking",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result != JOptionPane.OK_OPTION)
                return;

            if (name.getText().isEmpty() ||
                    date.getText().isEmpty() ||
                    persons.getText().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all details!"
                );
                return;
            }

            String booking =
                    "Customer: " + name.getText() +
                            "\nState/UT: " + state.getSelectedItem() +
                            "\nDate: " + date.getText() +
                            "\nPersons: " + persons.getText() +
                            "\nPackage: " + packageBox.getSelectedItem();

            bookings.add(booking);

            JOptionPane.showMessageDialog(
                    this,
                    "Booking Successful!\n\n" + booking
            );

            payment();
        }

        // ================= PAYMENT =================

        void payment() {

            JTextField amount = new JTextField();

            JComboBox<String> method =
                    new JComboBox<>(
                            new String[]{
                                    "UPI",
                                    "Credit Card",
                                    "Debit Card",
                                    "Net Banking",
                                    "Cash"
                            }
                    );

            Object[] fields = {
                    "Amount:", amount,
                    "Payment Method:", method
            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    fields,
                    "Payment",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {

                if (amount.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Enter payment amount!"
                    );
                    return;
                }

                JOptionPane.showMessageDialog(
                        this,
                        "PAYMENT SUCCESSFUL\n\n" +
                                "Amount: ₹" + amount.getText() +
                                "\nMethod: " + method.getSelectedItem()
                );

                receipt(amount.getText(),
                        method.getSelectedItem().toString());
            }
        }

        // ================= RECEIPT =================

        void receipt(String amount, String method) {

            String receipt =
                    "====================================\n" +
                            "       TRAVEL TOURISM RECEIPT\n" +
                            "====================================\n\n" +
                            "Payment Status : SUCCESS\n" +
                            "Payment Method : " + method + "\n" +
                            "Amount Paid    : ₹" + amount + "\n\n" +
                            "Thank You!\n" +
                            "Have a Safe Journey!\n" +
                            "====================================";

            JOptionPane.showMessageDialog(
                    this,
                    receipt,
                    "Receipt",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= VIEW BOOKINGS =================

        void viewBookings() {

            if (bookings.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "No booking available!"
                );

                return;
            }

            StringBuilder data =
                    new StringBuilder("ALL BOOKINGS\n\n");

            for (int i = 0; i < bookings.size(); i++) {

                data.append("BOOKING ")
                        .append(i + 1)
                        .append("\n");

                data.append(bookings.get(i))
                        .append("\n\n");
            }

            JTextArea area = new JTextArea(data.toString());
            area.setEditable(false);

            JOptionPane.showMessageDialog(
                    this,
                    new JScrollPane(area),
                    "Bookings",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= SEARCH =================

        void search() {

            String query = JOptionPane.showInputDialog(
                    this,
                    "Enter State, UT or City:"
            );

            if (query == null || query.trim().isEmpty())
                return;

            StringBuilder result =
                    new StringBuilder();

            for (Map.Entry<String, String[]> entry :
                    locations.entrySet()) {

                if (entry.getKey()
                        .toLowerCase()
                        .contains(query.toLowerCase())) {

                    result.append(entry.getKey())
                            .append("\n");

                    for (String city : entry.getValue()) {

                        result.append("  • ")
                                .append(city)
                                .append("\n");
                    }

                    result.append("\n");
                }

                for (String city : entry.getValue()) {

                    if (city.toLowerCase()
                            .contains(query.toLowerCase())) {

                        result.append("Found City: ")
                                .append(city)
                                .append("\n");

                        result.append("State/UT: ")
                                .append(entry.getKey())
                                .append("\n\n");
                    }
                }
            }

            if (result.length() == 0) {

                result.append(
                        "No State, UT or City Found."
                );
            }

            JOptionPane.showMessageDialog(
                    this,
                    result.toString(),
                    "Search Result",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= CANCEL BOOKING =================

        void cancelBooking() {

            if (bookings.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "No booking available!"
                );

                return;
            }

            String[] list =
                    new String[bookings.size()];

            for (int i = 0; i < bookings.size(); i++) {

                list[i] =
                        "Booking " + (i + 1);
            }

            String selected =
                    (String) JOptionPane.showInputDialog(
                            this,
                            "Select booking:",
                            "Cancel Booking",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            list,
                            list[0]
                    );

            if (selected != null) {

                int index =
                        Integer.parseInt(
                                selected.replace(
                                        "Booking ", "")
                        ) - 1;

                bookings.remove(index);

                JOptionPane.showMessageDialog(
                        this,
                        "Booking Cancelled Successfully!"
                );
            }
        }

        // ================= CUSTOMERS =================

        void showCustomers() {

            if (customers.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "No customers registered!"
                );

                return;
            }

            StringBuilder data =
                    new StringBuilder("CUSTOMER RECORDS\n\n");

            for (int i = 0; i < customers.size(); i++) {

                data.append("Customer ")
                        .append(i + 1)
                        .append("\n")
                        .append(customers.get(i))
                        .append("\n\n");
            }

            JOptionPane.showMessageDialog(
                    this,
                    data.toString(),
                    "Customers",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= ADMIN PANEL =================

        void adminPanel() {

            String data =
                    "ADMIN PANEL\n\n" +
                            "Total Customers: " +
                            customers.size() +
                            "\n" +
                            "Total Bookings: " +
                            bookings.size() +
                            "\n\n" +
                            "Admin Functions:\n" +
                            "• Customer Management\n" +
                            "• Booking Management\n" +
                            "• Payment Management\n" +
                            "• Destination Management\n" +
                            "• Package Management";

            JOptionPane.showMessageDialog(
                    this,
                    data,
                    "Admin Panel",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= MAIN =================

        public static void main(String[] args) {

            SwingUtilities.invokeLater(() -> {

                TravelTourism app =
                        new TravelTourism();

                app.setVisible(true);
            });
        }

    }

