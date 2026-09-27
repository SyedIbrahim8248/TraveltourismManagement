package travel.tourism;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//public class TravelTourismManagement {

    public class TravelTourismManagement extends JFrame {

        static ArrayList<String> bookings = new ArrayList<>();

        public TravelTourismManagement() {
            showLogin();
        }

        // ================= LOGIN =================
        void showLogin() {
            getContentPane().removeAll();

            setTitle("Travel & Tourism Management System");
            setSize(500, 350);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            JLabel title = new JLabel("TRAVEL & TOURISM MANAGEMENT");
            title.setFont(new Font("Arial", Font.BOLD, 20));
            title.setBounds(70, 30, 370, 40);
            add(title);

            JLabel userLabel = new JLabel("Username:");
            userLabel.setBounds(80, 100, 100, 30);
            add(userLabel);

            JTextField username = new JTextField();
            username.setBounds(180, 100, 220, 30);
            add(username);

            JLabel passLabel = new JLabel("Password:");
            passLabel.setBounds(80, 150, 100, 30);
            add(passLabel);

            JPasswordField password = new JPasswordField();
            password.setBounds(180, 150, 220, 30);
            add(password);

            JButton login = new JButton("Login");
            login.setBounds(180, 210, 100, 35);
            add(login);

            JButton register = new JButton("Register");
            register.setBounds(290, 210, 110, 35);
            add(register);

            login.addActionListener(e -> {
                String u = username.getText();
                String p = new String(password.getPassword());

                if (u.equals("admin") && p.equals("1234")) {
                    showDashboard();
                } else {
                    JOptionPane.showMessageDialog(
                            this,
                            "Invalid Login!\nUsername: admin\nPassword: 1234"
                    );
                }
            });

            register.addActionListener(e -> registration());

            revalidate();
            repaint();
        }

        // ================= REGISTRATION =================
        void registration() {
            JTextField name = new JTextField();
            JTextField email = new JTextField();
            JTextField phone = new JTextField();

            Object[] fields = {
                    "Customer Name:", name,
                    "Email:", email,
                    "Phone:", phone
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

                    JOptionPane.showMessageDialog(this,
                            "Please fill all fields!");
                } else {
                    JOptionPane.showMessageDialog(
                            this,
                            "Registration Successful!\nWelcome " + name.getText()
                    );
                }
            }
        }

        // ================= DASHBOARD =================
        void showDashboard() {
            getContentPane().removeAll();

            setTitle("Travel & Tourism Dashboard");

            JLabel title = new JLabel("TRAVEL & TOURISM MANAGEMENT");
            title.setFont(new Font("Arial", Font.BOLD, 22));
            title.setBounds(100, 20, 450, 40);
            add(title);

            JButton destination = new JButton("Destinations");
            destination.setBounds(80, 90, 160, 45);
            add(destination);

            JButton packages = new JButton("Travel Packages");
            packages.setBounds(260, 90, 160, 45);
            add(packages);

            JButton hotels = new JButton("Hotels");
            hotels.setBounds(80, 150, 160, 45);
            add(hotels);

            JButton booking = new JButton("Book Trip");
            booking.setBounds(260, 150, 160, 45);
            add(booking);

            JButton viewBooking = new JButton("View Booking");
            viewBooking.setBounds(80, 210, 160, 45);
            add(viewBooking);

            JButton search = new JButton("Search");
            search.setBounds(260, 210, 160, 45);
            add(search);

            JButton logout = new JButton("Logout");
            logout.setBounds(170, 275, 160, 45);
            add(logout);

            destination.addActionListener(e -> destinations());
            packages.addActionListener(e -> packages());
            hotels.addActionListener(e -> hotels());
            booking.addActionListener(e -> booking());
            viewBooking.addActionListener(e -> viewBooking());
            search.addActionListener(e -> searchDestination());

            logout.addActionListener(e -> showLogin());

            revalidate();
            repaint();
        }

        // ================= DESTINATIONS =================
        void destinations() {

            String message =
                    "POPULAR TRAVEL DESTINATIONS\n\n" +
                            "1. Delhi - Red Fort, India Gate\n" +
                            "2. Goa - Beaches, Water Sports\n" +
                            "3. Jaipur - Hawa Mahal, Amber Fort\n" +
                            "4. Manali - Mountains, Snow\n" +
                            "5. Kashmir - Dal Lake, Gulmarg\n" +
                            "6. Mumbai - Gateway of India\n" +
                            "7. Kerala - Backwaters\n" +
                            "8. Agra - Taj Mahal\n" +
                            "9. Hyderabad - Charminar\n" +
                            "10. Udaipur - City Palace";

            JOptionPane.showMessageDialog(
                    this,
                    message,
                    "Destinations",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= PACKAGES =================
        void packages() {

            String message =
                    "TRAVEL PACKAGES\n\n" +
                            "1. Goa Package\n" +
                            "   3 Days / 2 Nights\n" +
                            "   Price: ₹8,999\n\n" +

                            "2. Manali Package\n" +
                            "   5 Days / 4 Nights\n" +
                            "   Price: ₹14,999\n\n" +

                            "3. Kashmir Package\n" +
                            "   6 Days / 5 Nights\n" +
                            "   Price: ₹19,999\n\n" +

                            "4. Rajasthan Package\n" +
                            "   5 Days / 4 Nights\n" +
                            "   Price: ₹12,999\n\n" +

                            "5. Kerala Package\n" +
                            "   4 Days / 3 Nights\n" +
                            "   Price: ₹11,999";

            JOptionPane.showMessageDialog(
                    this,
                    message,
                    "Travel Packages",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= HOTELS =================
        void hotels() {

            String message =
                    "HOTEL DETAILS\n\n" +
                            "Goa:\n" +
                            "Beach Resort - ₹3,000/night\n\n" +

                            "Manali:\n" +
                            "Mountain View Hotel - ₹2,500/night\n\n" +

                            "Kashmir:\n" +
                            "Dal Lake Hotel - ₹3,500/night\n\n" +

                            "Jaipur:\n" +
                            "Royal Palace Hotel - ₹2,800/night\n\n" +

                            "Kerala:\n" +
                            "Backwater Resort - ₹3,200/night";

            JOptionPane.showMessageDialog(
                    this,
                    message,
                    "Hotel Details",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= BOOKING =================
        void booking() {

            JTextField name = new JTextField();
            JTextField destination = new JTextField();
            JTextField date = new JTextField();
            JTextField persons = new JTextField();

            String[] packageList = {
                    "Goa - ₹8999",
                    "Manali - ₹14999",
                    "Kashmir - ₹19999",
                    "Rajasthan - ₹12999",
                    "Kerala - ₹11999"
            };

            JComboBox<String> packageBox =
                    new JComboBox<>(packageList);

            Object[] fields = {
                    "Customer Name:", name,
                    "Destination:", destination,
                    "Travel Date:", date,
                    "Number of Persons:", persons,
                    "Package:", packageBox
            };

            int result = JOptionPane.showConfirmDialog(
                    this,
                    fields,
                    "Book Your Trip",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (result == JOptionPane.OK_OPTION) {

                if (name.getText().isEmpty() ||
                        destination.getText().isEmpty() ||
                        date.getText().isEmpty() ||
                        persons.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Please fill all details!"
                    );
                    return;
                }

                String selectedPackage =
                        packageBox.getSelectedItem().toString();

                String bookingData =
                        "Customer: " + name.getText() +
                                "\nDestination: " + destination.getText() +
                                "\nTravel Date: " + date.getText() +
                                "\nPersons: " + persons.getText() +
                                "\nPackage: " + selectedPackage;

                bookings.add(bookingData);

                JOptionPane.showMessageDialog(
                        this,
                        "Booking Successful!\n\n" +
                                bookingData
                );

                payment();
            }
        }

        // ================= PAYMENT =================
        void payment() {

            String[] methods = {
                    "UPI",
                    "Credit Card",
                    "Debit Card",
                    "Net Banking",
                    "Cash"
            };

            JComboBox<String> paymentBox =
                    new JComboBox<>(methods);

            JTextField amount = new JTextField();

            Object[] fields = {
                    "Payment Amount:", amount,
                    "Payment Method:", paymentBox
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

                String method =
                        paymentBox.getSelectedItem().toString();

                JOptionPane.showMessageDialog(
                        this,
                        "Payment Successful!\n\n" +
                                "Amount: ₹" + amount.getText() +
                                "\nMethod: " + method
                );

                receipt(amount.getText(), method);
            }
        }

        // ================= RECEIPT =================
        void receipt(String amount, String method) {

            String receipt =
                    "================================\n" +
                            "       TRAVEL TOURISM RECEIPT\n" +
                            "================================\n\n" +
                            "Payment Status : SUCCESS\n" +
                            "Payment Method : " + method + "\n" +
                            "Amount Paid    : ₹" + amount + "\n\n" +
                            "Thank you for booking with us!\n" +
                            "Have a Safe Journey!\n" +
                            "================================";

            JOptionPane.showMessageDialog(
                    this,
                    receipt,
                    "Payment Receipt",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= VIEW BOOKING =================
        void viewBooking() {

            if (bookings.isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "No bookings found!"
                );
                return;
            }

            StringBuilder allBookings =
                    new StringBuilder("YOUR BOOKINGS\n\n");

            for (int i = 0; i < bookings.size(); i++) {
                allBookings.append("Booking ")
                        .append(i + 1)
                        .append("\n")
                        .append(bookings.get(i))
                        .append("\n\n");
            }

            JTextArea area = new JTextArea(
                    allBookings.toString()
            );

            area.setEditable(false);

            JScrollPane scrollPane =
                    new JScrollPane(area);

            scrollPane.setPreferredSize(
                    new Dimension(450, 300)
            );

            JOptionPane.showMessageDialog(
                    this,
                    scrollPane,
                    "Booking Details",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= SEARCH =================
        void searchDestination() {

            String search = JOptionPane.showInputDialog(
                    this,
                    "Enter destination to search:"
            );

            if (search == null || search.isEmpty()) {
                return;
            }

            String result;

            switch (search.toLowerCase()) {

                case "goa":
                    result = "Goa\nBeaches, Water Sports\nBest for: Holidays";
                    break;

                case "manali":
                    result = "Manali\nMountains and Snow\nBest for: Adventure";
                    break;

                case "kashmir":
                    result = "Kashmir\nDal Lake and Gulmarg\nBest for: Nature";
                    break;

                case "jaipur":
                    result = "Jaipur\nHawa Mahal and Amber Fort\nBest for: Heritage";
                    break;

                case "kerala":
                    result = "Kerala\nBackwaters and Beaches\nBest for: Relaxation";
                    break;

                case "delhi":
                    result = "Delhi\nRed Fort and India Gate\nBest for: History";
                    break;

                default:
                    result = "Destination not found!";
            }

            JOptionPane.showMessageDialog(
                    this,
                    result,
                    "Search Result",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // ================= MAIN =================
        public static void main(String[] args) {

            SwingUtilities.invokeLater(() -> {
                new TravelTourismManagement().setVisible(true);
            });
        }
    }



